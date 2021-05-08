package com.allservlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbhelper.DbConnection;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String address = "Dhaka";
		String email = "tonni@gmail.com";
		String phone ="012";
		
		Statement stmt = null;
		
		
		System.out.println(firstName + " " + lastName);
		
		String query = "insert into reg(firstName,lastName,address,email,phone) values('"+ firstName +"','"+ lastName +"','"+ address +"','"+ email +"','"+ phone +"')";
		DbConnection obj = DbConnection.getInstance();
	    try {
			stmt = obj.getconnection().createStatement();
			 stmt.executeUpdate(query);
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	   
			}

}
