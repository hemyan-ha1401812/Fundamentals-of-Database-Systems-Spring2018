import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class EmployeeTableModel extends AbstractTableModel{

	private ArrayList<Employee>em;
	private String coulmnName[];
	
	
	public static void main(String[] args) {
		

	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return em.size();
	}

	
	public String getCoulmnName(int c)
	{
		return coulmnName[c];
	}
	
	public Object getValueAt(int rowIndex,)
	
	
	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
