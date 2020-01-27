package Ex5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JScrollBar;

public class searchGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	DAO e = new DAO(); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
		
					searchGUI frame = new searchGUI();
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
	public searchGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search by employee name");
		lblNewLabel.setBounds(28, 11, 156, 24);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(204, 13, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		
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
		btnSearch.setBounds(319, 12, 89, 23);
		contentPane.add(btnSearch);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(407, 46, 17, 204);
		contentPane.add(scrollBar);
		
		table = new JTable();
		table.setBounds(10, 43, 414, 207);
		contentPane.add(table);
		

	}
}
