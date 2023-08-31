package org.onlinebookstore.books;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VendorSignIn extends JFrame {

	private JPanel contentPane;
	//private JPanel contentPane;
	private JTextField txtEnterUsername;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	int flag=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendorSignIn frame = new VendorSignIn();
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
	public VendorSignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(160, 0, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEnterUsername = new JTextField();
		txtEnterUsername.setBounds(298, 209, 138, 20);
		contentPane.add(txtEnterUsername);
		txtEnterUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(298, 265, 138, 20);
		contentPane.add(passwordField);
		
		lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setBounds(335, 184, 127, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(335, 240, 163, 14);
		contentPane.add(lblNewLabel_1);
		
		final JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(319, 303, 100, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New User, Click Here to Join us!");
		lblNewLabel_2.setBounds(277, 365, 212, 14);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent me) {
		        VendorSignUp vs = new VendorSignUp();
		        dispose();
		        vs.setVisible(true);
		    	
		}
		}
		    );
		
		
		contentPane.add(lblNewLabel_2);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Connection c = DB_Connect.connect();
				String usern = txtEnterUsername.getText();
				String userpw = passwordField.getText();
				System.out.println(usern+" a ");
				
				String sql = "Select password from vendor where username=?";
				
				try {
					PreparedStatement p1 = c.prepareStatement(sql);
					p1.setString(1, usern);
					
					ResultSet s1 = p1.executeQuery();
					String pw = null;
					System.out.println(pw);
					
					if(s1.next())
					{
						pw = s1.getString(1);
						System.out.println(pw + " a");
						System.out.println(pw+" "+userpw);
						
						if(pw.equals(userpw))
						{
							flag=1;
						}
						
					}
					
					
					if(flag==0)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Wrong Username or password");
					}
							
					
					
				}
				catch(Exception exc)
				{
					exc.printStackTrace();
				}
				
				
				
				if(flag==1)
				{
					VendorConsole vc = new VendorConsole();
					dispose();
					vc.setVisible(true);
				}
				
			}
			
		});
		
	}

}
