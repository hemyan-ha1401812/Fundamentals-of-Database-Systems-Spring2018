import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws SQLException {
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@coestudb.qu.edu.qa:1521/STUD.qu.edu.qa","ha1401812","ha1401812");
		PreparedStatement stmt=conn.prepareStatement("insert into emp (empno, ename, sal) values (?,?,?)");
						Scanner in = new Scanner(System.in);
						for (int i = 0; i <3; i++) {
							System.out.println("Enter emp no: "); int num = in.nextInt();
							System.out.println("Enter emp name: "); String name = in.next();
							System.out.println("Enter emp Salary: "); double salary = in.nextDouble();
						stmt.setInt(1,num);
						stmt.setString(2, name);
						stmt.setDouble(3, salary);
						stmt.executeUpdate();
												
						}
						conn.close();
						in.close();

	}

}
