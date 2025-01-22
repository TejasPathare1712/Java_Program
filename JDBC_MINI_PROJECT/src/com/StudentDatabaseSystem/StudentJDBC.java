package com.StudentDatabaseSystem;

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

public class StudentJDBC extends JFrame implements ActionListener{
	JLabel lblroll,lblname,lblmarks,lblimage,lblmessage;
	JTextField txtroll,txtname,txtmarks;
	JButton btninsert,btndelete,btnshow,btnupdate,btnexit;
	JPanel p1,p2,p3;
	Font f1;
	Icon i1;
	public StudentJDBC() {
		// instantiation of components 
		lblroll = new JLabel("Roll of Student :  ");
		lblname = new JLabel("Name of Student: ");
		lblmarks = new JLabel("Marks of Student : ");
		lblmessage=new JLabel("                               ");
		txtroll = new JTextField(20);
		txtname = new JTextField(20);
		txtmarks = new JTextField(20);
		btninsert = new JButton("Insert ");
		btndelete = new JButton("Delete ");
		btnshow = new JButton("Show ");
		btnexit =  new JButton("Exit ");
		btnupdate =  new JButton("Update ");
		i1=new ImageIcon("sample.jpg");
		lblimage = new JLabel(i1);
		f1=new Font("Times New Roman",Font.BOLD,20);
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		// add components inside frame
		add(lblimage);
		
		p1.add(lblroll);
		p1.add(txtroll);
		p1.add(lblname);
		p1.add(txtname);
		p1.add(lblmarks);
		p1.add(txtmarks);
		
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
		setTitle("Student Management System Using JDBC ");
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		StudentJDBC s1=new StudentJDBC();
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
				PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");
				pstmt.setInt(1, Integer.parseInt(txtroll.getText()));
				pstmt.setString(2, txtname.getText());
				pstmt.setInt(3,Integer.parseInt(txtmarks.getText()));
				pstmt.executeUpdate();
				lblmessage.setText("Record Inserted Successfully!!");
			}
			else if(e.getSource()==btnupdate) {
				PreparedStatement pstmt=con.prepareStatement("update student set name=?,marks=? where roll=?");
				pstmt.setInt(3, Integer.parseInt(txtroll.getText()));
				pstmt.setString(1, txtname.getText());
				pstmt.setInt(2,Integer.parseInt(txtmarks.getText()));
				pstmt.executeUpdate();
				lblmessage.setText("Record updated Successsfully!!");
			}
			else if(e.getSource()==btndelete) {
				int r= Integer.parseInt(txtroll.getText());
				PreparedStatement pstmt=con.prepareStatement("delete from student where roll=?");
				pstmt.setInt(1, r);
				int c = pstmt.executeUpdate();
				if(c>=1)
					lblmessage.setText("Record Deleted");
				else {
					lblmessage.setText("Record not found");
				}
			}
			else if(e.getSource()==btnshow) {
				PreparedStatement pstmt=con.prepareStatement("select * from student where roll=?");
				pstmt.setInt(1, Integer.parseInt(txtroll.getText()));
				ResultSet rs=pstmt.executeQuery();
				if(rs.next()) {
					txtname.setText(rs.getString(2));
					txtmarks.setText(""+rs.getInt(3));
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

