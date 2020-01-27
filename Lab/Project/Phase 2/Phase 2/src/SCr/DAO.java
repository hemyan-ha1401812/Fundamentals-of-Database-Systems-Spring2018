
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
			conn= DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","ha1401812","ha1401812");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<Customer> getAll(){
		ArrayList<Customer> C = new ArrayList<>();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select *  from cust ");
			while (rs.next())
				C.add(new Customer(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)  ) );
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return C;
	}
	public ArrayList<Customer> search(String n) {
		ArrayList<Customer> C = new ArrayList<>();
		
		try {
			PreparedStatement stmt = conn.prepareStatement("select * from cust where custID like ?");
			stmt.setString(1, n);
			ResultSet rs = stmt.executeQuery();
			while (rs.next())
				C.add(new Customer( rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4) ));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return C;	
	}
}