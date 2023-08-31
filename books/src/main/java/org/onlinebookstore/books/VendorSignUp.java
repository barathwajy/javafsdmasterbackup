package org.onlinebookstore.books;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class VendorSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField Username;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendorSignUp frame = new VendorSignUp();
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
	public VendorSignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(160, 0, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Username = new JTextField();
		Username.setBounds(334, 96, 96, 20);
		contentPane.add(Username);
		Username.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(230, 99, 69, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(334, 149, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(230, 152, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(334, 197, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Confirm Password");
		lblNewLabel_2.setBounds(191, 200, 96, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(334, 245, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Company Name");
		lblNewLabel_3.setBounds(191, 248, 88, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(334, 301, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Contact Person");
		lblNewLabel_4.setBounds(191, 304, 88, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(334, 365, 96, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Phone Number");
		lblNewLabel_5.setBounds(191, 368, 88, 14);
		contentPane.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(334, 415, 308, 75);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setBounds(230, 431, 49, 14);
		contentPane.add(lblNewLabel_6);
	}
}
