import java.beans.Statement;
import java.sql.*;

/**
 * @author Hemyan AL-kuwari 	QUID:201401812
 *
 */
public  class Quiz4 {
	
	
	public static void main(String[] args) throws SQLException {
		// Part 1
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","ha1401812","ha1401812");
		// Part 2
		Statement stmt=(Statement) conn.createStatement();
		
		// Part3
		String sql=" update emp set sal= 9000"+" where deptno= 10"; 
		 int affectedRows =((java.sql.Statement) stmt).executeUpdate(sql);
		 System.out.println("Number of updated records "+affectedRows);
		 
		 // Part 4
		 ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select ename, job, sal from emp where deptno = (select deptno from emp where ename='SCOTT')");
		 
		 
	}

}
