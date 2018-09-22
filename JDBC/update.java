import java.sql.*;

public class update {
    public static void main(String[] args) throws SQLException 
    {
    String Database="test";
    String username="root";
    String password="";
    String url="jdbc:mysql://localhost:3306/"+Database;
    
    Connection conn =DriverManager.getConnection(url,username,password);
    System.out.println("connected");
    Statement stmt =conn.createStatement();
    int id=4;
    String first_name="rohan";
    String last_name ="sharma";
    String query= "INSERT into employee(id,first_name,last_name) VALUES("+id+",'"+first_name+"','"+last_name+"')";
    
    int count=stmt.executeUpdate(query);
    System.out.println(count +"rows effected");
    String selQuery ="SELECT *from employee";
    ResultSet rs=stmt.executeQuery(selQuery);
    while(rs.next())
    {
    String fname=rs.getString("first_name");
    String lname=rs.getString("last_name");
    System.out.println(fname+" "+lname);
    
    }
    
    conn.close();
    }
}
