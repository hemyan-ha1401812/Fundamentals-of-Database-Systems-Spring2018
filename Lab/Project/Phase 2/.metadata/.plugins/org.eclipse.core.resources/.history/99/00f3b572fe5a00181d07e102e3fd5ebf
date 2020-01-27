package Ex5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {
	Connection conn;
	
	public DAO() {
		try {
			conn= DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","scott","tiger123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<Employee> getAll(){
		ArrayList<Employee> e = new ArrayList<>();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select empno,ename,sal from emp");
			while (rs.next())
				e.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}
	public ArrayList<Employee> search(String n) {
		ArrayList<Employee> e = new ArrayList<>();
		
		try {
			PreparedStatement stmt = conn.prepareStatement("select empno,ename,sal from emp where ename like ?");
			stmt.setString(1, n);
			ResultSet rs = stmt.executeQuery();
			while (rs.next())
				e.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;	
	}
}
