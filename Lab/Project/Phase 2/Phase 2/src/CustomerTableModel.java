import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CustomerTableModel  extends AbstractTableModel{
	private ArrayList<Customer> cust;
	private String columnNames[]={"BaccNo","Bname","CustID","orderNO"};
	
	public CustomerTableModel(ArrayList<Customer> cust) {
		this.cust = cust;
		System.out.println(cust.size());
	}
	@Override
	public String getColumnName(int cust) {
		// TODO Auto-generated method stub
		return columnNames[cust];
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return cust.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		Customer C = cust.get(row);
		switch (col) {
		case 0: return C.getBankNo();
		case 1: return C.getBname();
		case 2: return C.getcustID();
		case 3: return C.getOrderNO();
		}
		return null;
	}
	
}
