package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CartServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int productId = Integer.parseInt(request.getParameter("pid")); // Fetch book ID from request

		HttpSession session = request.getSession();
		Integer userId = (Integer) session.getAttribute("id"); // Fetch user ID from session
		
		out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");

     
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH' crossorigin='anonymous'>");
        out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js' integrity='sha384-sF7hBtEq0qK+AcFzT0PBGpc6a3YtUCAUP0XmXXZnYuyjDPh4KWhp7PI17NTR57+q' crossorigin='anonymous'></script>");

        out.println("<title>Bootstrap in Servlet</title>");
        out.println("</head>");
        out.println("<body>");

		if (userId == null) {
			out.println("<h3>User not logged in. Please log in first.</h3>");
			return;
		}

		// Variables to store book details
		String prodName = "", prodInfo = "", prodPrice = "";
		//int year = 0;
		int quantity = 1; // Default quantity is 1

		try {
			// Establish connection to the database
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sportshop", "root", "root");

			// Fetch book details
			PreparedStatement prodStmt = con.prepareStatement("SELECT pid, pname,pinfo, price FROM cricket WHERE pid = ?");
			prodStmt.setInt(1, productId);
			ResultSet prs = prodStmt.executeQuery();

			if (prs.next()) {
				prodName = prs.getString("pname");
				prodInfo = prs.getString("pinfo");
				//year = bookRs.getInt("year");
				prodPrice = prs.getString("price");

				// Insert book into cart
				PreparedStatement cartStmt = con.prepareStatement("INSERT INTO cart (id, pid, qty, price, pdate) VALUES (?, ?, ?, ?, ?)");
				cartStmt.setInt(1, userId); // User ID
				cartStmt.setInt(2, productId); // Book ID
				cartStmt.setInt(3, quantity); // Quantity
				cartStmt.setString(4, prodPrice); // Price
				cartStmt.setTimestamp(5, new Timestamp(System.currentTimeMillis())); // Purchase date
				cartStmt.executeUpdate();

				out.println("<h3>Product added to cart successfully!</h3>");
				out.println("<p>Prod Name: " + prodName + "</p>");
				out.println("<p>Info: " + prodInfo + "</p>");
				out.println("<p>Quantity: " + quantity + "</p>");
				out.println("<p>Price: " + prodPrice + "</p>");
				
			} else {
				out.println("<h3> Prouduct  not found!</h3>");
			}

			prs.close();
			prodStmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			out.println("<h3>Error occurred while adding the book to the cart!</h3>");
		}
		out.println("<form action='BuyNowServlet' method='post'>");
		out.println("<button type='submit' class='btn btn-success'>Buy Now</button>");
		out.println("</form>");
		out.println("</body>");
	    out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
