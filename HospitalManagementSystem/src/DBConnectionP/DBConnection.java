/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnectionP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AbdulRehman
 */
public class DBConnection {
   
    private static Connection connection = null;
    public PreparedStatement pst = null;
    public ResultSet rst = null;
    public Statement st = null;
    
    public Connection OpenConnection(){
        
        connection = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system", "khannahk");
        }catch(SQLException e ){JOptionPane.showMessageDialog(null, e+"\n Error with Open Connection");} catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
    
    public ResultSet GetData(String sql){
        
        try{
            pst = connection.prepareStatement(sql);
            rst = pst.executeQuery();
        }catch(SQLException e ){JOptionPane.showMessageDialog(null, e+"\n Error with ResultSet GetDATA");}
    
        return rst;
    }
    
    public int InsertUpdateDelete(String sql){
        
        int flag = 0 ;
        try{
            pst = connection.prepareStatement(sql);
            flag = pst.executeUpdate();
        }catch(SQLException e ){JOptionPane.showMessageDialog(null, e+"\n Error with InsertUpdateDeleteQuery");}    
    return flag;
    }
    
    public void CloseConnection(){
        
        try{
            rst.close();
            pst.close();
            connection.close();
        }catch(SQLException e ){JOptionPane.showMessageDialog(null, e+"\n Error with Close Connection");}
        
        
    }
    
    public String getID(String q){
        int no=-1;
        try{
            DBConnection con = new DBConnection();
            con.OpenConnection();
            con.GetData(q);
            while(con.rst.next()){
                no=con.rst.getInt(1);
            }
            con.CloseConnection();
            }catch(SQLException e ){System.out.println(e);}
        no++;
        return String.valueOf(no);
        }
        
        
        
    
    
//    public void getingdata(){
//        
//        try{
//            DBConnection conn = new DBConnection();
//            conn.OpenConnection();
//            String query = "select * from ark";
//            conn.GetData(query);
//            
//            while(conn.rst.next()){
//                int a,b,c;
//                String d,e,f,g;
//                a = conn.rst.getInt("optid");
//                b = conn.rst.getInt("pid");
//                c = conn.rst.getInt("age");
//                d = conn.rst.getString("pfn");
//                e = conn.rst.getString("pln");
//                f = conn.rst.getString("gender");
//                g = conn.rst.getString("doctor");
//                
////                String a,b,c,d,e,f,g;
////                a = conn.rst.getString(1);
////                b = conn.rst.getString(2);
////                d = conn.rst.getString(3);
////                e = conn.rst.getString(4);
////                c = conn.rst.getString(5);
////                f = conn.rst.getString(6);
////                g = conn.rst.getString(7);
//                
//                System.out.println(a + " : " + b + " : "+ c +" : " + d + " : "+ e + " : " + f + " : " + g +"\n");
//            }
//            conn.CloseConnection();
//        }catch(SQLException e){JOptionPane.showMessageDialog(null, e+"\n Error with getingData ");}
//        
//        
//    
//    }
    
    public static void main(String[] args) {
        
//        Connection conn = null;
//        PreparedStatement pst = null;
//        ResultSet rs = null;
//        
//        try{
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system", "khannahk");
//            String q = "select * from ark";
//            pst = conn.prepareStatement(q);
//            rs= pst.executeQuery();
//            
//            while(rs.next()){
//                System.out.println(rs.getInt(1)+ " : "+rs.getInt(2)+ " : "+rs.getString(3)+ " : " + rs.getString(4)+ " : "+rs.getInt(5)+ " : "+rs.getString(6)+ " : "+rs.getString(7));
//            
//            }
//            conn.close();
//        }catch (SQLException | ClassNotFoundException ex) {System.out.println(ex);}


//    DBConnection con = new DBConnection();
//    con.OpenConnection();
//    con.getingdata();
    }
    
}
