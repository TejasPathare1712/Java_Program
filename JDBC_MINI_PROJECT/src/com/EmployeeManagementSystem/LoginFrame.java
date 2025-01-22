package com.EmployeeManagementSystem;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener {
	JLabel lblusername,lblpassword,lblmessage;
	JTextField txtusername;
	JPasswordField txtpassword;
	JButton btnlogin,btnlogout,btnregister;
	
	public LoginFrame() {
		//instantiation of all components 
		lblusername=new JLabel("UserName ");
		lblpassword = new JLabel("Password ");
		lblmessage = new JLabel("                            ");
		txtusername = new JTextField(20);
		txtpassword = new JPasswordField(20);
		btnlogin = new JButton("Login ");
		btnlogout = new JButton("Logout ");
		btnregister = new JButton("New User? Register Now!");
		
		setLayout(null);
		
		// add all components in frame
		int w=150,h=20;
		add(lblusername).setBounds(50,100,w,h);
		add(txtusername).setBounds(200, 100, w, h);
		add(lblpassword).setBounds(50,150,w,h);
		add(txtpassword).setBounds(200,150,w,h);
		add(btnlogin).setBounds(50,200, w, h);
		add(btnlogout).setBounds(250, 200, w, h);
		add(btnregister).setBounds(250,20,200,h);
		add(lblmessage).setBounds(50,300,300,20);
		
		
		//register the button for event handling
		btnlogin.addActionListener(this);
		btnlogout.addActionListener(this);
		btnregister.addActionListener(this);
		
		setSize(500,500);
		setVisible(true);
		setTitle("Login Window ");
		setLocationRelativeTo(null);
		
	}
	public static void main(String[] args) {
		new LoginFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnlogin) {
			String un=txtusername.getText();
			String pwd=txtpassword.getText();
			try {
				//Step 1 -> Register the driver 
				Class.forName("com.mysql.cj.jdbc.Driver");
				//System.out.println("Driver is loaded ");
				//Step 2 -> Obtain Connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
				//System.out.println("Connection established ");
				PreparedStatement pstmt=con.prepareStatement("select * from euser where username=? and password=?");
				pstmt.setString(1, un);
				pstmt.setString(2, pwd);
				ResultSet rs=pstmt.executeQuery();
				
				if(rs.next()) {
					this.dispose();
					new EmployeeJDBC();
				}
				else {
					lblmessage.setText("Invalid username or password");
				}
			}
			catch(Exception e1) {
				System.out.println(e1);
			}
		}
		else if(e.getSource()==btnregister) {
			this.dispose();
			new RegisterWindow();
		}
		else {
			this.dispose();
		}
	}
}

