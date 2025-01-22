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

public class RegisterWindow extends JFrame implements ActionListener {
	JLabel lblname,lblemail,lblusername,lblpassword;
	JTextField txtname,txtemail,txtusername;
	JPasswordField txtpassword;
	JButton btnregister,btnexit;
	
	public RegisterWindow() {
		//instantiation of components 
		lblname = new JLabel("Enter the Name ");
		lblemail = new JLabel("Enter email Id ");
		lblusername = new JLabel(" User Name ");
		lblpassword = new JLabel( " Password ");
		txtname = new JTextField();
		txtemail = new JTextField();
		txtusername = new JTextField();
		txtpassword = new JPasswordField();
		btnexit = new JButton("Exit ");
		btnregister = new JButton("Register ");
		
		// add components 
		setLayout(null);
		int w=150,h=20;
		add(lblname).setBounds(20,20,w,h);
		add(txtname).setBounds(200,20, w, h);
		add(lblemail).setBounds(20, 50, w, h);
		add(txtemail).setBounds(200, 50, w, h);
		add(lblusername).setBounds(20, 80, w, h);
		add(txtusername).setBounds(200,80,w,h);
		add(lblpassword).setBounds(20, 110, w, h);
		add(txtpassword).setBounds(200, 110, w, h);
		add(btnregister).setBounds(20, 140, w, h);
		add(btnexit).setBounds(200,140, w, h);
		
		//register button for event handling 
		btnregister.addActionListener(this);
		btnexit.addActionListener(this);
		
		//set default values
		setSize(500,400);
		setVisible(true);
		setTitle("Registration Window ");
		setLocationRelativeTo(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnregister) {
			String n,em,u,p;
			n=txtname.getText();
			em=txtemail.getText();
			u=txtusername.getText();
			p=txtpassword.getText();
			try {
				//Step 1 -> Register the driver 
				Class.forName("com.mysql.cj.jdbc.Driver");
				//System.out.println("Driver is loaded ");
				//Step 2 -> Obtain Connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
				//System.out.println("Connection established ");
				PreparedStatement pstmt=con.prepareStatement("insert into euser values(?,?,?,?)");
				pstmt.setString(1, n);
				pstmt.setString(2, em);
				pstmt.setString(3, u);
				pstmt.setString(4,p);
				
				pstmt.executeUpdate();
				this.dispose();
				new LoginFrame();
			}
			catch(Exception e1) {
				System.out.println(e);
			}
		}
		else {
			this.dispose();
		}
	}
	
}

