package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class RegistrationServlet
 */
//@WebServlet("RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	    

       
    
    public RegistrationServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name= request.getParameter("name");
	    String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");

        // Validate the input (basic example)
        if (name == null || username == null || email == null || password == null || address == null) {
            response.sendRedirect("registration.jsp?error=missing_fields");
            return;
        }
		try {
			//Step 1  Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quickshop","root","root");
			// Step 3
			PreparedStatement ps = con.prepareStatement("INSERT INTO users (name,username, email, password, address) VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, name);
            ps.setString(2, username);
            ps.setString(3, email);
            ps.setString(4, password); // In real apps, use a hashed password
            ps.setString(5, address);

            // Execute the insert
            int result = ps.executeUpdate();
            if (result > 0) {
                response.sendRedirect("login.jsp"); // Redirect on success
            } else {
                response.sendRedirect("registration.jsp?error=registration_failed"); // Redirect on failure
            }
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		    
	}
	}


