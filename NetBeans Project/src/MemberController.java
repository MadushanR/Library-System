
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MemberController {
     Connection conn = null;
     PreparedStatement prestmnt = null;
     ResultSet Reltset = null;
     DBConnector connect = new DBConnector();
     
      public void FindMember(String x,String find){
          Member m = new Member(x,"","","","",0,0);
          if("ID".equals(find)){
           try {
             conn = connect.dbConnect();
             String sql = "SELECT * FROM member WHERE MemberID= '"+m.getMemberID()+"'";
             prestmnt=conn.prepareStatement(sql);
             Reltset=prestmnt.executeQuery();
             
             if (Reltset.next()){
                 String MemberIDD = Reltset.getString(1);
                 String MemberName= Reltset.getString(2);
                 String MemberAddress= Reltset.getString(3);
                 String Status= Reltset.getString(4);
                 String MemberType= Reltset.getString(5);
                 String MemberAge= Reltset.getString(6);
                 String MemberCNumber= Reltset.getString(7);
                  JOptionPane.showMessageDialog(null,MemberIDD +" " + MemberName + " " + MemberAddress + " " + Status+" "+MemberType+" "+MemberAge+" "+MemberCNumber);
           }
             else
             {
                 JOptionPane.showMessageDialog(null, "Member not found");
             }
         } catch (SQLException ex) {
             Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
         }
     }else{
              Member mm = new Member("","","",x,"",0,0);
              try {
             conn = connect.dbConnect();
             String sql = "SELECT * FROM member WHERE MemberType= '"+mm.getMemberType()+"'";
             prestmnt=conn.prepareStatement(sql);
             Reltset=prestmnt.executeQuery();
             
             if (Reltset.next()){
                 String MemberIDD = Reltset.getString(1);
                 String MemberName= Reltset.getString(2);
                 String MemberAddress= Reltset.getString(3);
                 String Status= Reltset.getString(4);
                 String MemberType= Reltset.getString(5);
                 String MemberAge= Reltset.getString(6);
                 String MemberCNumber= Reltset.getString(7);
                  JOptionPane.showMessageDialog(null,MemberIDD +" " + MemberName + " " + MemberAddress + " " + Status+" "+MemberType+" "+MemberAge+" "+MemberCNumber);
           }
             else
             {
                 JOptionPane.showMessageDialog(null, "Not found");
             }
         } catch (SQLException ex) {
             Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
         }
          }
      }
}


