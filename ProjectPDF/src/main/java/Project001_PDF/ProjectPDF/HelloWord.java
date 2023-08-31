/*
package Project001_PDF.ProjectPDF;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HelloWord implements ActionListener{
	public static void main (String[] args) {
		SwingUtilities.invokeLater(() -> {
			 int pageIterator =0;
			try {
				PDDocument document = PDDocument.load(new File("D:\\OOPs_Test_8_8_23.pdf"));
				PDFRenderer pdfRenderer = new PDFRenderer(document);
				int endofbook = document.getNumberOfPages();
				JFrame frame = new JFrame("PDF Viewer");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				JPanel panel = new PDFPanel(pdfRenderer, pageIterator, 50);
				frame.getContentPane().add(panel);
				
				JButton NPbutton = new JButton("Next Page");
				NPbutton.putClientProperty(NPbutton, pageIterator);
				NPbutton.addActionListener(new ActionListener()
						{
					
					
//					public void actionPerformed(ActionEvent e,int pageIterator) {
//						// TODO Auto-generated method stub
//							if(pageIterator<endofbook)
//							{
//								pageIterator++;
//							}
//						
//					
//					}
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					});
				
				JButton PRbutton = new JButton("Previous Page");
				PRbutton.addActionListener(new ActionListener()
						{
					
//					public void actionPerformed(ActionEvent e,int pageIterator) {
//						// TODO Auto-generated method stub
//							if(pageIterator<endofbook)
//							{
//								pageIterator--;
//							}
//						
//					
//					}
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(pageIterator==0)
						{
							//pageIterator--;
						}
						
						}
					
						});
				
				frame.setPreferredSize(new Dimension(280, 450));
				frame.pack();
				frame.setVisible(true);

				//document.close();
				
				} 
			catch (IOException e) {
					e.printStackTrace();
			}
			});
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
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

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			try {
				BufferedImage image = pdfRenderer.renderImageWithDPI(pageIndex, dpi);
				g.drawImage(image, 0, 0, this);
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
*/