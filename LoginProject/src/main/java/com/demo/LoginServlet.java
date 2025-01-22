package com.demo;

import jakarta.servlet.RequestDispatcher;
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
import java.sql.ResultSet;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String un = request.getParameter("txtusername");
		String pwd = request.getParameter("password");
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/jdbc","root","root");  
			//here sonoo is database name, root is username and password  
			PreparedStatement pstmt=con.prepareStatement("select * from user where username=? and password=?"); 
			pstmt.setString(1, un );
			pstmt.setString(2, pwd);
			ResultSet rs=pstmt.executeQuery();  
			while(rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("ProductServlet");
				rd.forward(request, response);
			}
				//out.println("Login Successfully");
				/*if(un.equals("admin") &&pwd.equals("admin")) {
					RequestDispatcher rd = request.getRequestDispatcher("ProductServlet");
					rd.forward(request, response);
				}
				else {
					out.println("Invalid Login");
				}*/
				
				//RequestDispatcher rd = request.getRequestDispatcher("ProductServlet");
				//rd.forward(request, response);
				
			//}
			
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
			  
		/*PrintWriter out = response.getWriter();
		String un = request.getParameter("txtusername");
		String pwd = request.getParameter("password");
		if(un.equals("admin") &&pwd.equals("admin")) {
			out.println("<h1>Login Successfull</h1>");
		}
		else {
			out.println("<h1> Invalid username and Password</h1>");
		}
		
		out.println("<h1>HELLO SERVLET</h1>");
		}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
