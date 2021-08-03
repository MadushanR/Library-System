/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class ItemController {
     Connection conn = null;
     PreparedStatement prestmnt = null;
    
     ResultSet Reltset = null;
     
     DBConnector connect = new DBConnector();
      Statement stm = null;
     
     public void FindItem(String ItemID,String Title){
          Item i = new Item("","","",Title,ItemID,"",0,0,0,0);
          String TType;
          Date TDate;
          TLog tl = new TLog();
           TType="Find Item";
        TDate=tl.getTDate();
    
         try {
             conn = connect.dbConnect();
             String sql = "SELECT * FROM item WHERE ItemID= '"+i.getItemID()+"' or Title = '"+i.getTitle()+"'";
             String tlog = "Insert into tlog values ('"+TType+"','"+TDate+"')";
             prestmnt=conn.prepareStatement(sql);

             Reltset=prestmnt.executeQuery();
 
             
             if (Reltset.next()){
                String ItemIDD = Reltset.getString(1);
                 String Titlee= Reltset.getString(2);
                 String Author= Reltset.getString(3);
                 String Type= Reltset.getString(4);
                 String Language= Reltset.getString(5);
                 String NCopies= Reltset.getString(6);
                 String NCopiesA= Reltset.getString(7);
                 String NCopiesB= Reltset.getString(8);
                 String ISBN= Reltset.getString(9);
                 String Publisher = Reltset.getString(10); 
                 String PublishedDate = Reltset.getString(11); 
                
                 JOptionPane.showMessageDialog(null,ItemIDD +" " + Titlee + " " + Author + " " + Type+" "+Language+" "+NCopies+" "+NCopiesA+" "+NCopiesB+" "+ISBN+" "+Publisher+" "+PublishedDate);
           }
             else
             {
                 JOptionPane.showMessageDialog(null, "Item not found");
             }
         } catch (SQLException ex) {
             Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     public void BorrowItem(String MemberID,String ItemID){
         Member m = new Member(MemberID,"","","","",0,0);
         Item i = new Item("","","","",ItemID,"",0,0,0,0);
          String TType;
          Date TDate;
          TLog tl = new TLog();
          TType="Borrow";
          TDate=tl.getTDate();
          String tlog = "Insert into tlog values ('"+TType+"','"+TDate+"')";
             String url = "jdbc:mysql://localhost:3306/";
    String dbName = "librarysystem";
    String userName = "root"; 
    String password = "Hell123";
    
        try {
            conn = DriverManager.getConnection(url+dbName,userName,password);
        } catch (SQLException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stm = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
         
           
           String sql = "Insert into borrowitem values ( '"+MemberID+"','"+ItemID+"','"+TDate+"')";
           
           int c =0;
        try {
            c = stm.executeUpdate(sql);
            c = stm.executeUpdate(tlog);
        } catch (SQLException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
        }

           if (c>=1){

           JOptionPane.showMessageDialog(null, "Item Borrowed");}

           else
           {
           JOptionPane.showMessageDialog(null, "Could not borrow Item");
           }
    }
     
    public void ReturnItem(String ItemID){
        Item i = new Item();
         String TType;
          Date TDate;
          TLog tl = new TLog();
          TType="Return";
          TDate=tl.getTDate();
          String tlog = "Insert into tlog values ('"+TType+"','"+TDate+"')";
          String url = "jdbc:mysql://localhost:3306/";
    String dbName = "librarysystem";
    String userName = "root"; 
    String password = "Hell123";
    
        try {
            conn = DriverManager.getConnection(url+dbName,userName,password);
        } catch (SQLException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stm = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
         
           
          String sql = "delete from borrowitem where ItemID ='"+i.getItemID()+"'";
           
           int c =0;
        try {
            c = stm.executeUpdate(sql);
            c = stm.executeUpdate(tlog);
        } catch (SQLException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
        }

           if (c>=1){

           JOptionPane.showMessageDialog(null, "Item Returned");}

           else
           {
           JOptionPane.showMessageDialog(null, "Could not return Item");
           }
}
}

