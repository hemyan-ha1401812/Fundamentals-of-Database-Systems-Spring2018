package Lab_9;


public class DBOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBOperation db = new DBOperation();
		//db.insertIntoDept(55, "TEST", "TEST");
		//db.close();
		System.out.println(db.getDeptData(10)[0]+" "+db.getDeptData(10)[1]);
	}

}
