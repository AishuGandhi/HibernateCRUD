package jdbcdemo;

//import the package
import java.sql.*;
public class DemoClass
{

    public static void main(String[] args) throws ClassNotFoundException
    {
        try
        {
            String sName = "Sneha";
            int marks = 80;
            int rollNo = 6;
            String url = "jdbc:mysql://localhost:3306/JDBCDemo";
            String uname = "root";
            String pass = "admin123";
            String query = "select * from student";
            //String insertQuery = "insert into student values("+rollNo+","+marks+",'"+sName+"')";
            String insertQuery = "insert into student values(?,?,?)";
            // Load the class
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create the connection object
            Connection conn = DriverManager.getConnection(url,uname,pass);
            
            //create the Statement DDL
            Statement stmt = conn.createStatement();
            
            //DML 
            //Value will keep changing query stays same
            //stmt = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement(insertQuery);
            ps.setInt(1, rollNo);
            ps.setInt(2, marks);
            ps.setString(3, sName);
            int row = ps.executeUpdate();
            //int row = stmt.executeUpdate(insertQuery);
            System.out.println("Data Inserted("+row+" /s)Successfully!!!");
            
            //Execute the Query
            ResultSet rs = stmt.executeQuery(query);
            
            //Process the result 
            while(rs.next())
            {
                System.out.print(rs.getString(1)+":"+rs.getString(3)+":"+rs.getString(2));       
                System.out.println("\n");
            }
            System.out.println("Data Fetched Successfully!!!");
            //close the connection
            stmt.close();
            conn.close();
         }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("SQL Error");
        }

    }

}
