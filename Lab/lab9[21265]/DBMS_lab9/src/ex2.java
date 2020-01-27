import java.sql.*;
public class ex2 {

	public static void main(String[] args) throws SQLException{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa",
				"ha1401812","ha1401812");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select deptno, dname, loc from dept");
		while(rs.next()){
			String name = rs.getString("dname");
			int number = rs.getInt("deptno");
			String loc = rs.getString("loc");
			System.out.println(name + " " + number + " " + loc);
		}
		rs.close();
		conn.close();
	}

}
