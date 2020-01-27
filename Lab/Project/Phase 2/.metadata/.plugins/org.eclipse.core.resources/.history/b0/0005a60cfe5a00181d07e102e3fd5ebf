import java.sql.*;

import javax.swing.JOptionPane;


public class DBOperation {
	Connection conn;
	Statement stmt;
	public DBOperation() {
		try {
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","scott","tiger123");

			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertIntoDept(int dno,String name,String location){
		String sql="insert into dept values ("+dno+",'"+name+"','"+location+"')";
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Deptno already exist");
			//e.printStackTrace();
		}
	}
	public String[] getDeptData (int num){
		String dbString[]=new String[2];
		String sql= "select dname,loc from dept where deptno="+num;

		ResultSet rs;
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				dbString[0]=rs.getString(1);
				dbString[1]=rs.getString(2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dbString;
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
