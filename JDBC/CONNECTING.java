import java.sql.*;
public class CONNECTING {
    public static void main(String[] args) throws SQLException 
    {
    String Database="test";
    String username="root";
    String password="";
    String url="jdbc:mysql://localhost:3306/"+Database;
    
    Connection conn =DriverManager.getConnection(url,username,password);
    System.out.println("connected");
    conn.close();
    }
}
