package jdbcEx;
import java.sql.*;

public class jdbcex {
	public static void main(String[] args) {
		Connection conn;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","system","ankit");
		//System.out.println("connection established");
//		Statement st = conn.createStatement();
		
		//PreparedStatement ps = conn.preparedStatement("insert into employee values(201,'Kayu',350000)");  // same prcoes different statement
		//st.execute("insert into employee values(200,'Kayu',350000)");
//		PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?)"); //pre-compiled statement
		
//		ps.setInt(1,300);
//		ps.setString(2, "pooja");
//		ps.setInt(3, 3000);
//		ps.execute();
		
//		ResultSet rs = ps.executeQuery("select * from Employee");
		
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getInt(3));
//		}
		
//		ps.close();
//		st.close();
		
		CallableStatement c=conn.prepareCall("{call pro1(?,?)}");

        int sal;
        c.setInt(1,100); //setter method
        c.registerOutParameter(2,java.sql.Types.INTEGER); // fix the data type for ? =2 above, if varchar then change integer to varchar.
        c.executeUpdate();
        sal = c.getInt(2); //retreiving the ?=1 value here.(getter method)
        System.out.println(sal);

		
		
		conn.close();
		}
		catch(SQLException | ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
	}
}
