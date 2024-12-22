package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.ConnectionFactory;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("t1");
		String password=request.getParameter("t2");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			con=ConnectionFactory.getDBConnection();
			String sql="insert into login values(?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,userName);
			pstmt.setString(2,password);
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("<h1>Welcome "+userName+"</h1>");
		out.close();
	}

}
