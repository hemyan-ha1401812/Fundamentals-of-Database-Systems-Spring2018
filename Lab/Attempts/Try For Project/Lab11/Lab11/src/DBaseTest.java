import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DBaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBase db = new DBase();
		int empno= 1111; 
		String ename= "ppp";
		String job= "eeee";	
		int mgr= 7788; 
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
		java.util.Date dOld=null;
		try {
			dOld = formatter.parse("11-05-2012");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Date d = new Date(dOld.getTime());
		double sal=2000;
		double comm=200;
		int deptno= 10; 
		db.insertEmp(empno, ename, job, mgr, d, sal, comm, deptno);

	}

}
