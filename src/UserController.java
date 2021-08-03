/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class UserController {
    Connection conn = null;
     PreparedStatement prestmnt = null;
     ResultSet Reltset = null;
     DBConnector connect = new DBConnector();
     
    public void checkUser(String un, String pw){
        
         Librarian l = new Librarian (un, pw);
    
         try {
             conn = connect.dbConnect();
             String sql = "SELECT * FROM login WHERE User= '"+l.getUsername()+"' and Password = '"+l.getPassword()+"'";
             prestmnt=conn.prepareStatement(sql);
             Reltset=prestmnt.executeQuery();
             
             if (Reltset.next()){
                 
                  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inteface().setVisible(true);
            }
        });}
             
             else
             {
                 JOptionPane.showMessageDialog(null, "User Name or Password is Wrong");
             }
         } catch (SQLException ex) {
             Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
