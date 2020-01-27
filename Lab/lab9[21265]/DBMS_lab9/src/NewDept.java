import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class NewDept extends JFrame {

	private JPanel contentPane;
	private JTextField Departmentno;
	private JTextField Name;
	private JTextField Location;

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
		
		JLabel lblDeptNumber = new JLabel("Dept number");
		lblDeptNumber.setBounds(22, 26, 96, 29);
		contentPane.add(lblDeptNumber);
		
		Departmentno = new JTextField();
		Departmentno.setBounds(128, 26, 160, 28);
		contentPane.add(Departmentno);
		Departmentno.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(22, 95, 61, 16);
		contentPane.add(lblName);
		
		Name = new JTextField();
		Name.setBounds(128, 89, 147, 29);
		contentPane.add(Name);
		Name.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(22, 165, 61, 16);
		contentPane.add(lblLocation);
		
		Location = new JTextField();
		Location.setBounds(128, 162, 147, 21);
		contentPane.add(Location);
		Location.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(Departmentno.getText());
				String name = Name.getText();
				String location = Location.getText();
				try{
					Dbase newDB = new Dbase();
					newDB.insertToDept(num, name, location);
					newDB.close();
				}catch (SQLException e1){
					e1.printStackTrace();
				}
				
			}
		});
		btnEnter.setBounds(51, 228, 117, 29);
		contentPane.add(btnEnter);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(241, 228, 117, 29);
		contentPane.add(btnExit);
	}
}
