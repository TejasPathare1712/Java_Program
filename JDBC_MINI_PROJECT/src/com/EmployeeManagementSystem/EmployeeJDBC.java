package com.EmployeeManagementSystem;


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EmployeeJDBC extends JFrame implements ActionListener{
	JLabel empid,empname,empsalary,lblimage,lblmessage;
	JTextField txtempid,txtempname,txtempsalary;
	JButton btninsert,btndelete,btnshow,btnupdate,btnexit;
	JPanel p1,p2,p3;
	Font f1;
	Icon i1;
	public EmployeeJDBC() {
		// instantiation of components 
		empid = new JLabel("Id of Employee :  ");
		empname = new JLabel("Name of Employee: ");
		empsalary = new JLabel("Salary Of Employee : ");
		lblmessage=new JLabel("                               ");
		txtempid = new JTextField(20);
		txtempname = new JTextField(20);
		txtempsalary = new JTextField(20);
		btninsert = new JButton("Insert ");
		btndelete = new JButton("Delete ");
		btnshow = new JButton("Show ");
		btnexit =  new JButton("Exit ");
		btnupdate =  new JButton("Update ");
		i1=new ImageIcon("D:\\JavaProgram\\JDBC_MINI_PROJECT\\src\\com\\EmployeeManagementSystem\\sample.jpg");
		lblimage = new JLabel(i1);
		f1=new Font("Times New Roman",Font.BOLD,20);
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		// add components inside frame
		add(lblimage);
		
		p1.add(empid);
		p1.add(txtempid);
		p1.add(empname);
		p1.add(txtempname);
		p1.add(empsalary);
		p1.add(txtempsalary);
		
		add(p1);
		p1.setLayout(new GridLayout(3,2,2,3));
		
		p2.add(btninsert);
		p2.add(btnupdate);
		p2.add(btndelete);
		p2.add(btnshow);
		p2.add(btnexit);
		
		add(p2);
		p2.setLayout(new FlowLayout());
		
		p3.add(lblmessage);
		lblmessage.setFont(f1);
		add(p3);
		
		//set fonts
		btninsert.setFont(f1);
		btnupdate.setFont(f1);
		btndelete.setFont(f1);
		btnshow.setFont(f1);
		btnexit.setFont(f1);
	
		
		//change background color 
		Container c1=getContentPane();
		c1.setBackground(Color.MAGENTA);
		
		//register all components for event handling
		btninsert.addActionListener(this);
		btnupdate.addActionListener(this);
		btndelete.addActionListener(this);
		btnshow.addActionListener(this);
		btnexit.addActionListener(this);
		
		//set frame specifications
		setSize(600,400);
		setVisible(true);
		setTitle("Employee Management System Using JDBC ");
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		EmployeeJDBC s1=new EmployeeJDBC();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			//Step 1 -> Register the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver is loaded ");
			//Step 2 -> Obtain Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			//System.out.println("Connection established ");
			if(e.getSource()==btninsert) {
				PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
				pstmt.setInt(1, Integer.parseInt(txtempid.getText()));
				pstmt.setString(2, txtempname.getText());
				pstmt.setInt(3,Integer.parseInt(txtempsalary.getText()));
				pstmt.executeUpdate();
				lblmessage.setText("Record Inserted Successfully!!");
			}
			else if(e.getSource()==btnupdate) {
				PreparedStatement pstmt=con.prepareStatement("update employee set empname=?,empsalary=? where empid=?");
				pstmt.setInt(3, Integer.parseInt(txtempid.getText()));
				pstmt.setString(1, txtempname.getText());
				pstmt.setInt(2,Integer.parseInt(txtempsalary.getText()));
				pstmt.executeUpdate();
				lblmessage.setText("Record updated Successsfully!!");
			}
			else if(e.getSource()==btndelete) {
				int r= Integer.parseInt(txtempid.getText());
				PreparedStatement pstmt=con.prepareStatement("delete from employee where empid=?");
				pstmt.setInt(1, r);
				int c = pstmt.executeUpdate();
				if(c>=1)
					lblmessage.setText("Record Deleted");
				else {
					lblmessage.setText("Record not found");
				}
			}
			else if(e.getSource()==btnshow) {
				PreparedStatement pstmt=con.prepareStatement("select * from employee where empid=?");
				pstmt.setInt(1, Integer.parseInt(txtempid.getText()));
				ResultSet rs=pstmt.executeQuery();
				if(rs.next()) {
					txtempname.setText(rs.getString(2));
					txtempsalary.setText(""+rs.getInt(3));
				}
				else {
					lblmessage.setText("Record not Found");
				}
			}
			else if(e.getSource()==btnexit) {
				System.exit(0);
			}
		}
		catch(Exception e1) {
			
		}
	}
}


