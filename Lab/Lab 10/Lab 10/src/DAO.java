import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
Connection conn;
	public DAO() throws SQLException {
		conn =DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","ha1401812","ha1401812");
		
}

	public ArrayList<Employee> getAll(){
		ArrayList<Employee> e= new ArrayList<>();
		try{
		Statment stmt=conn.createStatement();
		
		ResultSet rs= stmt.executeQuery("select ename,sal from emp");
		while (rs.next()){
			e.add(new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3) ))
			
			
		}
		
		}catch(SQLException){}		
		
		
		
		
		
		
		
	}
	
	

}
