package com.Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	static Connection c;
	
	public static Connection createConnection()
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/itjdm06","root","root");
			
			System.out.println("data>>>>>>>>>>base>>>>>>>>>>>> connected>>>>>>>>>....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return c;
	}
	
}
