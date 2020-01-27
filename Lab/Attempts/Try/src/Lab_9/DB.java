package Lab_9;

import java.sql.*;


public class DB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","scott","tiger123");
			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery("select empno,ename,sal from emp");
//			while (rs.next()){
//				int num = rs.getInt(1);
//				String name = rs.getString("ename");
//				double sal = rs.getDouble("sal");
//				System.out.println(num+" "+name+" "+sal);
//			}
			ResultSet rs = stmt.executeQuery("select deptno,dname,loc from dept");
			while (rs.next()){
				int num = rs.getInt(1);
				String name = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(num+" "+name+" "+loc);
			}
			System.out.println("Table after insert new record");
			int effectedrow=stmt.executeUpdate("delete from dept where deptno=70");
			System.out.println("# of rows deleted"+effectedrow);
			stmt.executeQuery("insert into dept values (70,'CSE','QU')");
			rs = stmt.executeQuery("select deptno,dname,loc from dept");
			
			while (rs.next()){
				int num = rs.getInt(1);
				String name = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(num+" "+name+" "+loc);
			}
			System.out.println("Table after update");
			effectedrow=stmt.executeUpdate("update dept set dname='CSED' where deptno=70");
			System.out.println("# of rows updated"+effectedrow);
			rs = stmt.executeQuery("select deptno,dname,loc from dept order by dname");

			while (rs.next()){
				int num = rs.getInt(1);
				String name = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(num+" "+name+" "+loc);
			}
			
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
