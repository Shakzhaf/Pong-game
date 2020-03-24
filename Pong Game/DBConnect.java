
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {
  static Connection conn;
  
  public static Connection ConnecrDb(){
  try{
      Class.forName("com.mysql.jdbc.Driver");
      conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pong","root","");
              return conn;
  }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
      return null;
  }
}
}  
