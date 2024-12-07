/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;
import java.sql.*;
/**
 *
 * @author Ammaf
 */
public class Conn {
    public static Connection getCon()
    {
        final String url= "jdbc:mysql://localhost/project";
        final String user= "root";
        final String pass="bhaago1234";
        
        Connection con = null;
        Statement st = null;
        
    
        try {
        
        con = DriverManager.getConnection(url,user,pass);
        System.out.print("Connected to database");
        return con;
       
        
           
    }
        catch(Exception e)
        {
        return null;
        }
}
    
}
