import java.sql.*;

public class prpared_statement {
    public static void main(String[] args) throws SQLException 
    {
    String Database="test";
    String username="root";
    String password="";
    String url="jdbc:mysql://localhost:3306/"+Database;
    
    Connection conn =DriverManager.getConnection(url,username,password);
    System.out.println("connected");
    PreparedStatement pstmt=conn.prepareStatement("insert into employee values(?,?,?)");
    pstmt.setInt(1,6);
    pstmt.setString(2,"tarun");
    pstmt.setString(3,"verma");
    pstmt.execute();
    System.out.println("record insert");
    conn.close();
    }
}
