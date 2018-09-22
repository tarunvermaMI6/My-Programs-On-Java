
package JDBC;
import java.sql.*;

public class connection {
    public static void main(String[] args) throws SQLException
    {
      String database ="test";
    String username ="root";
    String password="";
    String url="jdbc:mysql://localhost:3306/"+database;
    Connection con=DriverManager.getConnection(url,username,password);
    System.out.println("connected");
    con.close();
    }
}
