package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DbConnection {
	
	static DbConnection obj = null;
	
	private DbConnection ()
	{
		
	}
    public static synchronized DbConnection getInstance ()
    {
    	if(obj==null)
    	{
    		obj= new DbConnection();
    		return obj;
    	}
    	else 
    		return obj;
    }
    public Connection getconnection()
    {
    	Connection  conn = null;
		
		
    	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost:3306/student";
		
		final String USER = "root";
		final String PASS ="admin";
		
		try {
			
			
			Class.forName(JDBC_DRIVER);
			
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	return conn;
    }
    }
