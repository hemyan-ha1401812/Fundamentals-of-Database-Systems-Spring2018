package Lab_10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","scott","tiger123");
			conn.setAutoCommit(false);
			PreparedStatement stmt = conn.prepareStatement("insert into dept values(?,?,?)");
			stmt.setInt(1, 99);
			stmt.setString(2, "IT");
			stmt.setString(3, "DOHA");
			stmt.executeUpdate();
			PreparedStatement stmt2=conn.prepareStatement("insert into emp(empno,ename,sal,deptno) values(?,?,?,?)");
			stmt2.setInt(1, 777);
			stmt2.setString(2,"Naser");
			stmt2.setDouble(3, 3000);
			stmt2.setInt(4, 70);
			stmt2.executeUpdate();
			
			int answer=JOptionPane.showConfirmDialog(null,"Commit all statements?", "Confrimation", JOptionPane.YES_NO_OPTION);
			if (answer==JOptionPane.YES_OPTION)
				conn.commit();
			else
				conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
