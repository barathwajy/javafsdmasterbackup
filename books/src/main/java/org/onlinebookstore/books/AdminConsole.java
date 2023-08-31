package org.onlinebookstore.books;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminConsole extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminConsole frame = new AdminConsole();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminConsole() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(160, 0, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Manage Stock");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(308, 154, 141, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Place Stock Order");
		btnNewButton_1.setBounds(308, 209, 141, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Manage Vendors");
		btnNewButton_2.setBounds(308, 260, 141, 23);
		contentPane.add(btnNewButton_2);
	}
}
