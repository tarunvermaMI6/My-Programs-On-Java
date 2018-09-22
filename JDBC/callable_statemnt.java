
package JDBC.execute_query;
import java.sql.*;
public class callable_statemnt {
    public static void main(String[] args) throws SQLException
    {
      String database ="test";
    String username ="root";
    String password="";
    String url="jdbc:mysql://localhost:3306/"+database;
    Connection con=DriverManager.getConnection(url,username,password);
    System.out.println("connected");
    }

}
