package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/information";
		String user="root";
		String password="Arifa@3004";
		
		//step-1:load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("The Driver is loaded Successfully");
		
		//step-2:Establishing the connection
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection established....");
		
		//step-3:Statement Creation
		Statement st=con.createStatement();
		
		//step-4:Executing a query
		st.executeUpdate("CREATE TABLE student(sid int,sname varchar(20))");
		System.out.println("Table Created Successfully");
		
		st.close();
		con.close();

	}

	
}
