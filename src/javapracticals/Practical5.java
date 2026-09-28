/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticals;
import java.sql.*;

/**
 *
 * @author gautam-makwana
 */
public class Practical5 {
    public static void main(String[] args){
        // Database URL
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "";
        
        try{
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish Connection
            Connection con = DriverManager.getConnection(url,username,password);
            
            // Create Statement
            Statement stmt = con.createStatement();
            
            // SQL Query
            String query = "CREATE TABLE Student("
                    + "RollNo INT PRIMARY KEY,"
                    + "Name VARCHAR(50),"
                    + "Address VARCHAR(100))";
            
            // Execute Query
            stmt.executeUpdate(query);
            System.out.println("Student Table Created Successfully...");
            
            // Insert Records
            stmt.executeUpdate("INSERT INTO Student VALUES (101, 'Rahul Sharma','Ahmedabad')");
            stmt.executeUpdate("INSERT INTO Student VALUES (102, 'Priya Patel','Surat')");
            stmt.executeUpdate("INSERT INTO Student VALUES (103, 'Amit Kumar','Vadodra')");
            stmt.executeUpdate("INSERT INTO Student VALUES (104, 'Sneha Shah','Rajkot')");
            stmt.executeUpdate("INSERT INTO Student VALUES (105, 'Karan Mehta','Gandhinagar')");
            
            // Record Inserted Successfully
            System.out.println("Records Inserted Successfully...");
                        
            // Close Resources
            stmt.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}