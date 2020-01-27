package Lab_9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class NewDept extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewDept frame = new NewDept();
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
	public NewDept() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeptNumber = new JLabel("Dept Number");
		lblDeptNumber.setBounds(70, 55, 76, 14);
		contentPane.add(lblDeptNumber);
		
		textField = new JTextField();
		textField.setBounds(159, 52, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(70, 96, 46, 14);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 93, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(70, 141, 46, 14);
		contentPane.add(lblLocation);
		
		textField_2 = new JTextField();
		textField_2.setBounds(159, 138, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DBOperation dbop = new DBOperation();
				int deptno = Integer.parseInt(textField.getText());
				String dname = textField_1.getText();
				String loc = textField_2.getText();
				dbop.insertIntoDept(deptno, dname, loc);
				JOptionPane.showMessageDialog(null, "DONE");
				//dbop.close();
			}
		});
		btnInsert.setBounds(84, 199, 89, 23);
		contentPane.add(btnInsert);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setBounds(226, 199, 89, 23);
		contentPane.add(btnExit);
	}
}
