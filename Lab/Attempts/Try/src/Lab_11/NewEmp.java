package Lab_11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;


public class NewEmp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblMgr;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JLabel lblSal;
	private JTextField textField_3;
	private JLabel lblComm;
	private JTextField textField_4;
	private JLabel lblNewLabel;
	private JTextField textField_5;
	private JLabel lblDeptNo;
	private JButton btnNewButton_1;
	private DBase db = new DBase();
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

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public NewEmp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmpno = new JLabel("Empno");
		lblEmpno.setBounds(31, 3, 46, 14);
		contentPane.add(lblEmpno);
		
		textField = new JTextField();
		textField.setBounds(104, 0, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEname = new JLabel("Ename");
		lblEname.setBounds(31, 28, 46, 14);
		contentPane.add(lblEname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 25, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblJob = new JLabel("Job");
		lblJob.setBounds(31, 53, 46, 14);
		contentPane.add(lblJob);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 50, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblMgr = new JLabel("mgr");
		lblMgr.setBounds(31, 92, 46, 14);
		contentPane.add(lblMgr);
		
		comboBox = new JComboBox();
		comboBox.setBounds(104, 89, 86, 20);
		contentPane.add(comboBox);
		
		lblSal = new JLabel("HireDate");
		lblSal.setBounds(31, 127, 46, 14);
		contentPane.add(lblSal);
		
		textField_3 = new JTextField();
		textField_3.setBounds(104, 120, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblComm = new JLabel("Sal");
		lblComm.setBounds(31, 162, 46, 14);
		contentPane.add(lblComm);
		
		textField_4 = new JTextField();
		textField_4.setBounds(104, 159, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel = new JLabel("Comm");
		lblNewLabel.setBounds(31, 191, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_5 = new JTextField();
		textField_5.setText("");
		textField_5.setBounds(104, 188, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		lblDeptNo = new JLabel("Dept no");
		lblDeptNo.setBounds(31, 216, 46, 14);
		contentPane.add(lblDeptNo);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(104, 213, 86, 20);
		contentPane.add(comboBox_1);
		ArrayList<String> e = db.getAllEmp();
		for (String s:e)
			comboBox.addItem(s);
		ArrayList<String> d = db.getAllDept();
		for (String s:d)
			comboBox_1.addItem(s);	
		//db.close();
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int empno= Integer.parseInt(textField.getText()); 
				String ename= textField_1.getText();
				String job= textField_2.getText();	
				String mgrString= (String) comboBox.getSelectedItem();
				String token[] = mgrString.split(" ");
				int mgr= Integer.parseInt(token[0]); 
				SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date dOld=null;
				try {
					dOld = formatter.parse(textField_3.getText());
					
					System.out.println(dOld.toString());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				Date d = new Date(dOld.getTime());
				double sal=Double.parseDouble(textField_4.getText());
				double comm=Double.parseDouble(textField_5.getText());
				
				String deptnoString= (String) comboBox_1.getSelectedItem();
				String token2[] = deptnoString.split(" ");
				int deptno= Integer.parseInt(token2[0]); 
				//db.insertEmp(empno, ename, job, mgr, d, sal, comm, deptno);
				db.insertEmp(empno, ename, job, mgr, d, sal, comm, deptno);
				System.out.println(	empno+" "+ename+" "+job+" "+mgr+" "+d+" "+sal+" "+ comm+" "+ deptno);

			}
		});
		btnNewButton.setBounds(31, 238, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(130, 238, 89, 23);
		contentPane.add(btnNewButton_1);
		

	}
}
