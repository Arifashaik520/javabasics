package jdbcprograms.dao;

import java.sql.*;
import javax.sql.*;

public class DButil {
	private static Connection conn;
	private static final String Driver="com.mysql.cj.jdbc.Driver";
	private static final String USERNAME="root";
	private static final String PASSWORD="Arifa@3004";
	private static final String URL="jdbc:mysql://localhost:3306/information";
	
	public static Connection getConnection() 
	{
		try 
		{
		 Class.forName(Driver);
		 System.out.println("Driver loaded successfully");
		 
		 conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		 System.out.println("Connection established....");
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return conn;
	}
	

}
