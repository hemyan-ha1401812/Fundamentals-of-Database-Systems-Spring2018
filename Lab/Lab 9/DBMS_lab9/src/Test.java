import java.sql.*;

public class Test {
	public static void main(String args[]) throws SQLException{

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa",
				"na1604159", "na1604159");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select empno, ename, sal from emp"); //Query for select/Displaying result
		while(rs.next()){
			String name = rs.getString(2);
			int number = rs.getInt("empno");
			double sal = rs.getDouble("sal"); //You can either use number or type the name
			System.out.println(name + " " + number + " " + sal);
		}
		String sql = "delete from emp where empno = 333";
		int affectedRows = stmt.executeUpdate(sql);
		System.out.println("\nNumber of updated records: "+ affectedRows);
		
		rs.close();
		conn.close();

	}
}
