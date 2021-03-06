
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Bank_Acc_Operation {
	Connection conn;
	Statement stmt;
	public Bank_Acc_Operation() {
		try {
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","ha1401812","ha1401812");

			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public void insertIntoBankAcc(String bName,double amount,int accNum ){
		String sql="insert into bankAccount (bName, amount, accNum) values ('"+bName+"',"+amount+","+accNum+")";
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "accNum already exist");
			e.printStackTrace();
		}
	}
	
	
	
	
	public ArrayList<bankAccount> search(int n) {
		ArrayList<bankAccount> ba = new ArrayList<>();
	
		try {
			PreparedStatement stmtp = conn.prepareStatement("select bname, amount, accnum from bankAccount where accNum = ?");
			stmtp.setInt(1, n);
			ResultSet rs = null; 
			while (rs.next())
				rs = stmtp.executeQuery();
				ba.add(new bankAccount(rs.getString(1), rs.getDouble(2),rs.getInt(3)));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ba;
		
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
