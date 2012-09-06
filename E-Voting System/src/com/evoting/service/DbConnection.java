package com.evoting.service;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;


public class DbConnection {
	private static Connection conn=null;
	
	public static Connection getConn()
	{
		String userName = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3307/e-voting?allowMultiQueries=true";
        try{
        Class.forName ("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection (url, userName, password);
        }
		catch(Exception e)
		{
			
		}
		return conn;
	}
	
	public static void closeConn()
	{
		try{
		if(null!=conn)
			conn.close();
		}
		catch(Exception e)
		{
			
		}
	}

}

