package grp1.Dempproj;

/**
 * Hello world!
 *
 */
import java.sql.*;
public class App 
{
    public static void main( String[] args )
    {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = null;
			String userName = null;
			String password = null;
			Connection conn1 = DriverManager.getConnection(url,userName,password);
            if(conn1!=null) {
                System.out.println("Connection with database established");
            }
        }
        catch(SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
