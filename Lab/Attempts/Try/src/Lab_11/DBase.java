package Lab_11;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DBase {
	private Connection conn;
	private Statement stmt;
	public DBase() {
		super();
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa",
					"ha1401812","ha1401812");
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertEmp(int empno,String ename,String job,int mgr,Date d, double sal,double comm,int deptno){
		String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, empno);st.setString(2, ename);st.setString(3, job);st.setInt(4, mgr);
			st.setDate(5, d);st.setDouble(6, sal);st.setDouble(7, comm);st.setInt(8, deptno);
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ArrayList<String> getAllEmp(){
		ArrayList<String> temp = new ArrayList<>() ;
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select empno,ename from emp");
			while (rs.next())
				temp.add(rs.getInt(1)+" "+rs.getString(2));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	public ArrayList<String> getAllDept(){
		ArrayList<String> temp = new ArrayList<>() ;
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from dept");
			while (rs.next())
				temp.add(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	public void close(){
		try {
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
