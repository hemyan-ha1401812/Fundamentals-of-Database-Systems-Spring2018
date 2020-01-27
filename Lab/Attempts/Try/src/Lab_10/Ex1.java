package Lab_10;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","scott","tiger123");
		PreparedStatement stmt = conn.prepareStatement("select empno,ename,sal,hiredate from emp where sal>? and job=?");
		stmt.setDouble(1, 2000);
		stmt.setString(2, "MANAGER");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()){
			int num = rs.getInt(1);
			String name = rs.getString(2);
			double sal = rs.getDouble(3);
			Date hire = rs.getDate(4);
			System.out.println(num+" "+name+" "+sal+" "+hire);
		}
		rs.close();
		conn.close();
	}

}