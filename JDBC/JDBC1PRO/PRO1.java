import java.sql.*;

public class PRO1{
 public static void main(String [] args) throws SQLException
 {
   String database ="student";
   String username ="root";
   String password ="";
   
   String url="jdbc:mysql://localhost:3306/"+ database ;
  Connection conn = DriverManager.getConnection(url,username,password);
System.out.println("connection established");
 conn.close();
 }

}