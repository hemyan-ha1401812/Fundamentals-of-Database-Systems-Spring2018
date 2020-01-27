package Lab_10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","scott","tiger123");
			CallableStatement stCall = conn.prepareCall("{call raiseSal(?,?)}");
			stCall.setInt(1, 20);
			stCall.setInt(2, 5);
			stCall.execute();
			stCall.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
