import java.sql.*;
public class Dbase {
	Connection conn;
	Statement stmt;
	public Dbase() throws SQLException{
		conn = DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa",
				"na1604159", "na1604159");
		stmt = conn.createStatement();
	}
	
	public void insertToDept(int num, String name, String location) throws SQLException{
		String sql = "insert into dept (deptno, dname, loc) values ("+num+", '"+name+"', '"+location+"')";
		stmt.executeUpdate(sql); //update for updating/deleting/inserting
	}
	
	public void close() throws SQLException{
		stmt.close();
		conn.close();
	}
	

}
