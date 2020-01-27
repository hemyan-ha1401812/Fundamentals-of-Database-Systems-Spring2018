import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class CustomerInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	
	DAO C = new DAO(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerInfo frame = new CustomerInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerId = new JLabel("Customer ID ");
		lblCustomerId.setBounds(10, 11, 107, 14);
		contentPane.add(lblCustomerId);
		
		textField = new JTextField();
		textField.setBounds(147, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		
		/*
		 	btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<Employee> ea = null;
				String na = textField.getText();
				if (na.length()==0)
					ea= e.getAll();
				else
					ea= e.search(na);
				EmployeeTableModel model = new EmployeeTableModel(ea);
				table.setModel(model);
			}
		}); 
		
		
		
		*/
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ArrayList<Customer> cid = null;
			String na = textField.getText();
			if (na.length()==0)
				cid = C.getAll();
			else
				cid= C.search(na);
			CustomerTableModel model = new CustomerTableModel(cid);
			table.setModel(model);
		}
				
		}
	);
		
		btnSearch.setBounds(277, 11, 89, 23);
		contentPane.add(btnSearch);
		
		table = new JTable();
		table.setBounds(10, 41, 414, 209);
		contentPane.add(table);
	}

}
