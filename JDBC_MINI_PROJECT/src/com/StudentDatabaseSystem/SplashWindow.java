package com.StudentDatabaseSystem;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashWindow extends JFrame implements ActionListener{
	JLabel lblshow;
	JButton btnnext;
	
	public SplashWindow() {
		lblshow = new JLabel();
		lblshow.setHorizontalAlignment(SwingConstants.CENTER);
		lblshow.setBounds(5, 5, 520, 253);
		lblshow.setIcon(new ImageIcon("E:\\Java\\JDBCMiniProject\\welcome.jpg"));
		btnnext = new JButton("Next");
		btnnext.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 28));
		btnnext.setBounds(195, 246, 143, 59);
		getContentPane().setLayout(null);
		
		getContentPane().add(lblshow);
		getContentPane().add(btnnext);
		
		btnnext.addActionListener(this);
		
		setSize(551,546);
		setVisible(true);
		setTitle("My Student Project");
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new SplashWindow();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.dispose();
		new LoginFrame();
	}
}

