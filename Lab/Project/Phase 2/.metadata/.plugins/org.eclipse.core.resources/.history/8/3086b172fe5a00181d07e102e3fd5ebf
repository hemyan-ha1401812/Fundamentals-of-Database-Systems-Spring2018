package Ex5;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class EmployeeTableModel extends AbstractTableModel{
	private ArrayList<Employee> em;
	private String columnNames[]={"Empno","Ename","Sal"};
	
	public EmployeeTableModel(ArrayList<Employee> em) {
		this.em = em;
		System.out.println(em.size());
	}
	@Override
	public String getColumnName(int c) {
		// TODO Auto-generated method stub
		return columnNames[c];
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

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		Employee e = em.get(row);
		switch (col) {
		case 0: return e.getEmpno();
		case 1: return e.getEname();
		case 2: return e.getSal();
		}
		return null;
	}
	
}
