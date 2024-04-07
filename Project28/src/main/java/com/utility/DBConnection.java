package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static String url = "jdbc:mysql://localhost:3306/demodb";
	public static String username="root";
	public static String password = "";
	public static Connection con;
	
	public static Connection getConnection()
	{
		try {
			if(con!=null)
			{
				return con;
			}
			else {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url,username,password);
			}
		}catch(Exception e)
		{
			System.out.println("Exception occured in connection class "+e);
		}
		return con;
	}
}
