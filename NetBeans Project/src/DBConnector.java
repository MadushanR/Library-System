/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class DBConnector {
     String url = "jdbc:mysql://localhost:3306/";
    String dbName = "librarysystem";
    String userName = "root"; 
    String password = "Hell123";
    
    Connection conn = null;
    
    public Connection dbConnect(){
        try {
            conn = DriverManager.getConnection(url+dbName,userName,password);
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
       
    }
}
