package Project001_PDF.ProjectPDF;


import org.apache.pdfbox.pdmodel.PDDocument;

import org.apache.pdfbox.rendering.PDFRenderer;

 

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;

import java.io.File;

import java.io.IOException;

 

public class PDFViewer implements WindowListener{

    private int currentPageIndex = 0;

    private JFrame frame;

    private PDFPanel pdfPanel;

    private int dpi = 1; 

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            new PDFViewer().createAndShowGUI();

        });

    }

    private void createAndShowGUI() {

        try {

            PDDocument document = PDDocument.load(new File("C:\\Users\\barathwaj.y\\Downloads\\Linux Command Line and Shell Scripting Bible.pdf"));

            PDFRenderer pdfRenderer = new PDFRenderer(document);

            int endOfBook = document.getNumberOfPages();

            frame = new JFrame("PDF Viewer");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            pdfPanel = new PDFPanel(pdfRenderer, currentPageIndex, dpi);

//            JScrollPane scrollPane = new JScrollPane(pdfPanel);
//
//            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//
//            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

 

            frame.getContentPane().add(pdfPanel);

 

            JButton nextPageButton = new JButton("Next Page");

            nextPageButton.addActionListener(new ActionListener() {

                @Override

                public void actionPerformed(ActionEvent e) {

                    if (currentPageIndex < endOfBook - 1) {

                        currentPageIndex++;

                        pdfPanel.setPageIndex(currentPageIndex);

                        pdfPanel.repaint();

                    }

                }

            });

 

            JButton previousPageButton = new JButton("Previous Page");

            previousPageButton.addActionListener(new ActionListener() {

                @Override

                public void actionPerformed(ActionEvent e) {

                    if (currentPageIndex > 0) {

                        currentPageIndex--;

                        pdfPanel.setPageIndex(currentPageIndex);

                        pdfPanel.repaint();

                    }

                }

            });

 

            JPanel buttonPanel = new JPanel();

            buttonPanel.add(previousPageButton);

            buttonPanel.add(nextPageButton);

 

            frame.add(buttonPanel, BorderLayout.SOUTH);

 

            frame.setPreferredSize(new Dimension(800, 600));

            frame.pack();

            frame.setVisible(true);

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("closed da");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("closed da");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("closed da");

	}

}

class PDFPanel extends JPanel {

    private PDFRenderer pdfRenderer;

    private int pageIndex;

    private int dpi;

 

    public PDFPanel(PDFRenderer pdfRenderer, int pageIndex, int dpi) {

        this.pdfRenderer = pdfRenderer;

        this.pageIndex = pageIndex;

        this.dpi = dpi;

    }

 

    public void setPageIndex(int pageIndex) {

        this.pageIndex = pageIndex;

    }

    @Override

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        try {

            BufferedImage image = pdfRenderer.renderImage(pageIndex, dpi);

            int panelWidth = getWidth();

            int panelHeight = getHeight();

            
            double scaleX = (double) panelWidth / image.getWidth();

            double scaleY = (double) panelHeight / image.getHeight();

 

            double scaleFactor = Math.min(scaleX, scaleY);

 

            int scaledWidth = (int) (image.getWidth() * scaleFactor);

            int scaledHeight = (int) (image.getHeight() * scaleFactor);

 

            int x = (panelWidth - scaledWidth) / 2;

            int y = (panelHeight - scaledHeight) / 2;
 

            g.drawImage(image, x, y, scaledWidth, scaledHeight, this);

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
