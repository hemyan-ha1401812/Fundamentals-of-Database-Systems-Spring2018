import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BillConn {
	
	Connection conn;
	
	
	public BillConn() {
		try {
			conn= DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","ha1401812","ha1401812");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Bill> search(int n) {
		ArrayList<Bill> b = new ArrayList<>();
		
		try {
			PreparedStatement stmtp = conn.prepareStatement("select quantity, price, discount, accnum from Bill where accNum = ?");
			stmtp.setInt(1, n);
			ResultSet rs = null; 
			while (rs.next())
				rs = stmtp.executeQuery();
				b.add(new Bill(rs.getInt(1), rs.getDouble(2),rs.getDouble(3),rs.getInt(4)));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
}
}