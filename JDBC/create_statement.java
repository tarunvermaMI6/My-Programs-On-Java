
package JDBC.execute_query;

import java.sql.*;
public class create_statement {
    public static void main(String[] args) throws SQLException
    {
      String database ="test";
    String username ="root";
    String password="";
    String url="jdbc:mysql://localhost:3306/"+database;
    Connection con=DriverManager.getConnection(url,username,password);
    System.out.println("connected");
    Statement stmt=con.createStatement();
    String queryCreate="Create table student( id INT,name VARCHAR(25),class INT );";
    stmt.execute(queryCreate);
    int count=stmt.executeUpdate("INSERT into student(id,name,class) value(1,'tarun',5);");  
    String query="select *from student ";
    ResultSet rs=stmt.executeQuery(query);
    
    while(rs.next())
    {
    int id=rs.getInt(1);
    String name=rs.getString("name");
    System.out.println(id+" "+name);
    }
    
    }

}
