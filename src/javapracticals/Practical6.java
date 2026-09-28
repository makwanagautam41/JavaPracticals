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
public class Practical6 {
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
            String query = "SELECT * FROM Student";
            
            // Execute Query
            ResultSet rs = stmt.executeQuery(query);
            
            // Display Table Header
            System.out.println("----------------------------------------------");
            System.out.println("RollNo\t\tName\t\tAddress");
            System.out.println("----------------------------------------------");
            
            // Display Record
            while(rs.next()){
                System.out.println(
                rs.getInt("RollNo")+"\t"
                +rs.getString("Name")+"\t"
                +rs.getString("Address"));
            }
            System.out.println("----------------------------------------------");
            
            // Close Resources
            rs.close();
            stmt.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}