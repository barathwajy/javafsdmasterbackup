package org.onlinebookstore.books;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	private JTextField Email;
	private JTextField Password;
	private JTextField Confirm_Password;
	private JTextField Pincode;
	private JTextField Phone_Number;
	private JComboBox Country;
	private JTextField City;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerSignUp frame = new CustomerSignUp();
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
	public CustomerSignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(160, 0, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Name = new JTextField();
		Name.setBounds(324, 59, 96, 20);
		contentPane.add(Name);
		Name.setColumns(10);
		
		Email = new JTextField();
		Email.setBounds(324, 99, 96, 20);
		contentPane.add(Email);
		Email.setColumns(10);
		//if(.contains(Email.getText()));
		
		Password = new JTextField();
		Password.setBounds(324, 146, 96, 20);
		contentPane.add(Password);
		Password.setColumns(10);
		
		Confirm_Password = new JTextField();
		Confirm_Password.setBounds(324, 193, 96, 20);
		contentPane.add(Confirm_Password);
		Confirm_Password.setColumns(10);
		
		final JTextArea Address = new JTextArea();
		Address.setBounds(324, 224, 312, 44);
		contentPane.add(Address);
		
		Pincode = new JTextField();
		Pincode.setBounds(324, 283, 96, 20);
		contentPane.add(Pincode);
		Pincode.setColumns(10);
		
		Country = new JComboBox();
		Country.addItem("--Select Country--");
		Country.setBounds(324, 378, 125, 22);
		contentPane.add(Country);
		
		
		City = new JTextField();
		City.setBounds(324, 318, 96, 20);
		contentPane.add(City);
		City.setColumns(10);
		
		
		try {
			Connection c = DB_Connect.connect();
			PreparedStatement countryq = c.prepareStatement("Select name from countries");
			ResultSet rs = countryq.executeQuery();
			
			while(rs.next())
			{	Country.addItem(rs.getString("name"));				
			}
		/*
		 * 
		 * 	
		 JComboBox City = new JComboBox();
		City.setBounds(324, 314, 125, 22);
		contentPane.add(City);
		*/
				
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		
		Phone_Number = new JTextField();
		Phone_Number.setBounds(324, 347, 96, 20);
		contentPane.add(Phone_Number);
		Phone_Number.setColumns(10);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(209, 62, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setBounds(209, 102, 49, 14);
		contentPane.add(lblEmailId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(209, 149, 105, 14);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(209, 196, 139, 14);
		contentPane.add(lblConfirmPassword);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(209, 244, 49, 14);
		contentPane.add(lblAddress);
		
		JLabel lblPincode = new JLabel("Pincode");
		lblPincode.setBounds(209, 286, 49, 14);
		contentPane.add(lblPincode);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(209, 318, 49, 14);
		contentPane.add(lblCity);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(209, 350, 114, 14);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(209, 382, 49, 14);
		contentPane.add(lblCountry);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 11, 766, 94);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Sign Up!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					String name = Name.getText();
					String email = Email.getText();
					String password = Password.getText();
					System.out.println(Address.getText());
					String address = Address.getText();
					Integer pincode = 000000;
					

					if((Pincode.getText().length()>0))
					{
						 pincode = Integer.valueOf(Pincode.getText());
					}
					
					 String phoneno = (Phone_Number.getText());
					String country = Country.getSelectedItem().toString();
					String city = City.getText(); 
					
					try {
						Connection c = DB_Connect.connect();
						PreparedStatement updatedb = c.prepareStatement("insert into customer_details(name,emailid,passwd,address,pincode,city,country,phone_no) values(?,?,?,?,?,?,?,?)");
						updatedb.setString(1, name);
						updatedb.setString(2, email);
						updatedb.setString(3, password);
						updatedb.setString(4, address);
						updatedb.setInt(5, pincode);
						updatedb.setString(6, city);
						updatedb.setString(7, country);
						updatedb.setString(8, phoneno);
						int rc = updatedb.executeUpdate();
						System.out.println(rc);
						//ResultSet rs = updatedb.executeQuery();
					
					}
					catch(Exception e2)
					{
						
					}
					
			}
			
		});
		btnNewButton.setBounds(309, 430, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Already a Bibliophilia?, Click here to Login");
		lblNewLabel_2.setBounds(260, 464, 259, 14);
		contentPane.add(lblNewLabel_2);
		
	
		
		
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent me) {
		        CustomerSignIn ci = new CustomerSignIn();
		        dispose();
		        ci.setVisible(true);
		    	
		}
		}
		    );
		
	}
}
