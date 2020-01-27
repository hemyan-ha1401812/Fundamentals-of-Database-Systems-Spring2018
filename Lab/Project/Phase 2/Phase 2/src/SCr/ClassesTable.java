

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ClassesTable extends AbstractTableModel{
	private ArrayList<ClassesAttributes> c;
	private String columnNames[]={"Price","Type"};
	
	public ClassesTable(ArrayList<ClassesAttributes> c) {
		this.c = c;
		System.out.println(c.size());
	}
	@Override
	public String getColumnName(int c) {
		// TODO Auto-generated method stub
		return columnNames[c];
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return c.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		ClassesAttributes ca = c.get(row);
		switch (col) {
		case 0: return ca.getPrice();
		case 1: return ca.getType();
		}
		return null;
	}
	
}
