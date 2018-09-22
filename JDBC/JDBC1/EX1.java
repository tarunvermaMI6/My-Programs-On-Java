import java.sql.*;

public class EX1 
 {

 public static void main(String[] args) throws SQLException
 {
    String database ="test1";
    String username="root";
    String password="";
    
    String url="jdbc:mysql://localhost:3306/" + database;
    
    Connection conn =DriverManager.getConnection(url,username,password);
  System.out.println("Connection Established");
  
  conn.close();
 }
}