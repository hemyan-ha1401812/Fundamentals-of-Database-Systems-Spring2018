import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex3 {

	public static void main(String[] args) throws SQLException {
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","ha1401812","ha1401812");
		CallableStatement stCall=conn.prepareCall("{call raiseSal(?,?)}");
						
		stCall.setInt(1,20);
		stCall.setInt(2,5);
		stCall.execute();
		stCall.close();
		conn.close();
		
		
		
	}

}
