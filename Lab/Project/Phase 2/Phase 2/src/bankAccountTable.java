import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class bankAccountTable extends AbstractTableModel {
	private ArrayList<bankAccount> bAcc;
	private String columnNames[]={"bName","Amount","accNum"};
	
	public bankAccountTable(ArrayList<bankAccount> bAcc) {
		this.bAcc = bAcc;
		System.out.println(bAcc.size());
	}
	public String getColumnName(int c) {
		// TODO Auto-generated method stub
		return columnNames[c];
	}

	
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}


	public int getRowCount() {
		// TODO Auto-generated method stub
		return bAcc.size();
	}

	
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		bankAccount ba = bAcc.get(row);
		switch (col) {
		case 0: return ba.getbName();
		case 1: return ba.getAmount();
		case 2: return ba.getAccNum();
		}
		return null;
	
	}
}
