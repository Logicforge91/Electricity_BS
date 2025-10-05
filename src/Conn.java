package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    // instance variables
    Connection c;
    Statement st;

    public Conn() {
        try {
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebs", // database URL
                "root",                           // username
                "User@123"                        // password
            );

            // Create a statement object
            st = c.createStatement();

            System.out.println("✅ Database connected successfully!");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e);
        }
    }
}
