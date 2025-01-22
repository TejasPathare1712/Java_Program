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

/**
 * Servlet implementation class BuyNowServlet
 */
public class BuyNowServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        Integer userId = (Integer) session.getAttribute("id");

        if (userId == null) {
            out.println("<h3>User not logged in. Please log in first.</h3>");
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sportshop", "root", "root");

            PreparedStatement stmt = con.prepareStatement("SELECT pid, qty, price FROM cart WHERE id = ?");

            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            double totalAmount = 0;
            int totalQuantity = 0;

            out.println("<html><head><title>Buy Now</title></head><body>");
            out.println("<h2>Order Summary</h2>");
            out.println("<table border='1'><tr><th>Product ID</th><th>Quantity</th><th>Price</th><th>Subtotal</th></tr>");

            while (rs.next()) {
                int productId = rs.getInt("pid");
                int qty = rs.getInt("qty");
                double price = Double.parseDouble(rs.getString("price"));
                double subtotal = qty * price;

                totalQuantity += qty;
                totalAmount += subtotal;

                out.println("<tr><td>" + productId + "</td><td>" + qty + "</td><td>" + price + "</td><td>" + subtotal + "</td></tr>");
            }

            out.println("</table>");
            out.println("<h3>Total Quantity: " + totalQuantity + "</h3>");
            out.println("<h3>Total Amount: " + totalAmount + "</h3>");

            out.println("<form action='PlaceOrderServlet' method='post'>");
            out.println("<input type='hidden' name='totalAmount' value='" + totalAmount + "'>");
            out.println("<input type='hidden' name='totalQuantity' value='" + totalQuantity + "'>");
            out.println("<button type='submit' class='btn btn-primary'>Place Order</button>");
            out.println("</form>");

            out.println("</body></html>");

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error occurred while processing the request.</h3>");
        }
    }
}
