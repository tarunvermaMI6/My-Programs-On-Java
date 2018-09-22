import java.sql.*;

public class EX2{
  public static void main(String[] args) throws SQLException{
   String database = "test1";
   String username = "root";
   String password = "";
   
   String url="jdbc:mysql://localhost:3306/"+ database ;
   
   Connection conn= DriverManager.getConnection(url,username,password);
   System.out.println("connection established");
   
   Statement stmt =conn.createStatement();
   
   String query ="SELECT * FROM employee_2";
   ResultSet rs=stmt.executeQuery(query);
 
    while(rs.next())
    {
     int id= rs.getInt(1);
     String name=rs.getString("first_name");
     System.out.println(id +"#" +name);
    
    }
    conn.close();
  
  } 


}