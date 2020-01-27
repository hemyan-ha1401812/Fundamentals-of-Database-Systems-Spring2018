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
import javax.swing.JComboBox;
import javax.swing.JButton;

public class NewEmp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JComboBox comboBox = new JComboBox();
	private JComboBox comboBox_1 = new JComboBox();
	Dbase db;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewEmp frame = new NewEmp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	;
	
	/**
	 * Create the frame.
	 */
	public NewEmp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmpno = new JLabel("EmpNo");
		lblEmpno.setBounds(63, 13, 56, 16);
		contentPane.add(lblEmpno);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(63, 31, 56, 16);
		contentPane.add(lblName);
		
		JLabel lblJob = new JLabel("Job");
		lblJob.setBounds(63, 49, 56, 16);
		contentPane.add(lblJob);
		
		JLabel lblManager = new JLabel("Manager");
		lblManager.setBounds(63, 68, 56, 16);
		contentPane.add(lblManager);
		
		JLabel lblHreDate = new JLabel("Hre Date");
		lblHreDate.setBounds(63, 89, 56, 16);
		contentPane.add(lblHreDate);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(63, 111, 56, 16);
		contentPane.add(lblSalary);
		
		JLabel lblCommission = new JLabel("Commission");
		lblCommission.setBounds(63, 129, 88, 16);
		contentPane.add(lblCommission);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(63, 158, 100, 16);
		contentPane.add(lblDepartment);
		
		textField = new JTextField();
		textField.setBounds(149, 10, 116, 16);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 28, 116, 16);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(149, 46, 116, 16);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(149, 86, 116, 16);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(149, 108, 116, 16);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(149, 126, 116, 16);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		
		comboBox.setBounds(149, 65, 116, 16);
		contentPane.add(comboBox);
		
		comboBox_1.setBounds(149, 155, 116, 22);
		contentPane.add(comboBox_1);
		ArrayList<String> em=db.getAllEmp();
		for (String st:em)
			comboBox.addItem(st);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(54, 203, 97, 25);
		contentPane.add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int empno = Integer.parseInt(textField.getText());
				String ename = textField_1.getText();
				String job = textField_2.getText();
				String mgrString = (String) comboBox.getSelectedItem();
				String token[]	= mgrString.split(" ");
				int mgr = Integer.parse
			
			
			
			
			}
		});	
		
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(218, 203, 97, 25);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
		
	}
}
