import java.sql.*;

public class PRO3{
 public static void main(String [] args) throws SQLException
 {
   String database ="student";
   String username ="root";
   String password ="";
   
   String url="jdbc:mysql://localhost:3306/"+ database ;
  Connection conn = DriverManager.getConnection(url,username,password);
  System.out.println("connection established");
    
  Statement stmt = conn.createStatement();
  
  String query ="SELECT *from employeesql6";
  ResultSet rs = stmt.executeQuery(query);
  
   while( rs.next())
   {
    int salary =rs.getInt("salary");
    String name =rs.getString("first_name");
    System.out.println(salary + ","+name);
   
   }
   conn.close();
          
          
 }

}