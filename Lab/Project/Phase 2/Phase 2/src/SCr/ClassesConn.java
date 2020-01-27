import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClassesConn {


	Connection conn;
	Statement stmt;
	public ClassesConn() {
		try {
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","ha1401812","ha1401812");

			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<ClassesAttributes> getAll(){
		ArrayList<ClassesAttributes> c = new ArrayList<>();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select price, type from classes");
			while (rs.next())
				c.add(new ClassesAttributes(rs.getDouble(1), rs.getString(2)));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return c;
	}
	
}
