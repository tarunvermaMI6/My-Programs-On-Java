
package JDBC.execute_query;
import java.sql.*;

public class prepared_statement {
public static void main(String[] args) throws SQLException
    {
      String database ="test";
    String username ="root";
    String password="";
    String url="jdbc:mysql://localhost:3306/"+database;
    Connection con=DriverManager.getConnection(url,username,password);
    System.out.println("connected");
    
    PreparedStatement pstmt=con.prepareStatement("insert into student(id,name,class) values(?,?,?);");
    pstmt.setInt(1,3);
    pstmt.setString(2,"mohan");
    pstmt.setInt(3,4);
    int count =pstmt.executeUpdate();
    System.out.println(count+"rows affected");
    //String query="select *from student";
    PreparedStatement pstmt1=con.prepareStatement("select *from student");
    ResultSet rs=pstmt1.executeQuery();
    while(rs.next())
    {
      int id=rs.getInt(1);
      String name=rs.getString("name");
      //=rs.getInt(3);
      System.out.println(id+" "+name+);
    }
    }
    
}
