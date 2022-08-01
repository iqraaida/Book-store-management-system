



package myframebooksotre;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
public class codes1 {
    Connection con;
    Statement std;
    ResultSet rs;
    public void setConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/bookstore","root","");
            std= con.createStatement();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            
        }
    }
    public void setSQL(String sql){
        try{
       
           setConnection();
          int r= std.executeUpdate(sql);
             JOptionPane.showMessageDialog(null,r==1?"operation is done":"failed");
       con.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            
        }
        
    }
    public void viewTable(String sql,JTable table){
          try{
           setConnection();
           rs=std.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            
        }
}
    public ResultSet search(String sql){
          try{
           
            setConnection();
             rs=std.executeQuery(sql);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            
        } 
    return rs;
}
    

}
