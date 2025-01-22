package com.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int id=Integer.parseInt(request.getParameter("id"));
		//String name = request.getParameter("name");
		//String cat = request.getParameter("cat");
		//int price =Integer.parseInt(request.getParameter("price"));
		  try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
		      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		      PreparedStatement pstmt = con.prepareStatement("update product set pname=?,pcategory=?,price=? where pid=?");
		      //pstmt.setInt(1, id);
		      pstmt.setString(1, "Mobile");
		      pstmt.setString(2, "ELectronics");
		      pstmt.setInt(3, 1000);
		      pstmt.setInt(4, id);
		      pstmt.executeUpdate();
		      RequestDispatcher rd = request.getRequestDispatcher("ProductServlet");
		      rd.forward(request, response);
		  }
		  	catch(Exception e) {
		  		System.out.println(e);
		   }
		   }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
