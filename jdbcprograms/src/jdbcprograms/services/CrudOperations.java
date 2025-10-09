package jdbcprograms.services;

import java.sql.*;
import jdbcprograms.dao.DButil;

public class CrudOperations {
	static Connection conn;
    static PreparedStatement pst;
    static ResultSet rs;

    // static block to connect once
    static {
        conn = DButil.getConnection();
        if (conn != null)
        {
            System.out.println("Database connection is active.\n");
        }
        else 
        {
            System.out.println("Failed to connect to the database.\n");
        }
    }

    //INSERT 
    public static int addStudent(int sid, String sname) 
    {
        int n = 0;
        try {
            pst = conn.prepareStatement("INSERT INTO student VALUES(?, ?)");
            pst.setInt(1, sid);
            pst.setString(2, sname);
            n = pst.executeUpdate();
            System.out.println(n + " record(s) inserted.");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return n;
    }

    //UPDATE
    public static int updateStudentName(int sid, String newName) 
    {
        int n = 0;
        try {
            pst = conn.prepareStatement("UPDATE student SET sname = ? WHERE sid = ?");
            pst.setString(1, newName);
            pst.setInt(2, sid);
            n = pst.executeUpdate();
            System.out.println(n + " record(s) updated.");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return n;
    }

    //DELETE
    public static int deleteStudent(int sid)
    {
        int n = 0;
        try {
            pst = conn.prepareStatement("DELETE FROM student WHERE sid = ?");
            pst.setInt(1, sid);
            n = pst.executeUpdate();
            System.out.println(n + " record(s) deleted.");
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        return n;
    }

    // SELECT
    public static void displayAllStudents() 
    {
        try {
            pst = conn.prepareStatement("SELECT * FROM student");
            rs = pst.executeQuery();
            System.out.println("\n--- Student Table ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("sid") + " | Name: " + rs.getString("sname"));
            }
            System.out.println("------------------------\n");
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    // SELECT ONE 
    public static void searchStudent(int sid)
    {
        try {
            pst = conn.prepareStatement("SELECT * FROM student WHERE sid = ?");
            pst.setInt(1, sid);
            rs = pst.executeQuery();

            if (rs.next()) 
            {
                System.out.println("Student Found → ID: " + rs.getInt("sid") +
                                   ", Name: " + rs.getString("sname"));
            } 
            else
            {
                System.out.println("No student found with ID: " + sid);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}