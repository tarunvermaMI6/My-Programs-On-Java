import java.sql.*;


public class EXECUTE_query {
 
    public static void main(String[] args) throws SQLException 
    {
    String Database="test";
    String username="root";
    String password="";
    String url="jdbc:mysql://localhost:3306/"+Database;
    
    Connection conn =DriverManager.getConnection(url,username,password);
    System.out.println("connected");
        Statement stmt =conn.createStatement();
        String query="SELECT *FROM employee";
        ResultSet rs =stmt.executeQuery(query);
        while(rs.next())
        {
       int id =rs.getInt(1);
       String name=rs.getString("first_name");
        System.out.println(id+" "+name);
        }
    conn.close();
    }
}
