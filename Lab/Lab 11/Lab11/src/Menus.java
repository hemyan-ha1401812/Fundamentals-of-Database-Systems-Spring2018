import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Menus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menus frame = new Menus();
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
	public Menus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNew = new JMenu("New");
		menuBar.add(mnNew);
		
		JMenuItem mntmEmployee = new JMenuItem("Employee");
		mntmEmployee.addActionListener(new ActionListener() {
		public void actionPreformed(ActionEvent e){
			NewEmp newemp = new NewEmp();
			newemp.setVisible(true);
			newemp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		}
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
 		
		mnNew.add(mntmEmployee);
		
		JMenuItem mntmDepartment = new JMenuItem("Department");
		mnNew.add(mntmDepartment);
		
		JMenuItem mntmGrade = new JMenuItem("Grade");
		mnNew.add(mntmGrade);
		
		JMenu mnUpdate = new JMenu("Update");
		menuBar.add(mnUpdate);
		
		JMenuItem mntmEmployee_1 = new JMenuItem("Employee");
		mnUpdate.add(mntmEmployee_1);
		
		JMenuItem mntmDepartment_1 = new JMenuItem("Department");
		mnUpdate.add(mntmDepartment_1);
		
		JMenuItem mntmGrade_1 = new JMenuItem("Grade");
		mnUpdate.add(mntmGrade_1);
		
		JMenu mnRemove = new JMenu("Remove");
		menuBar.add(mnRemove);
		
		JMenuItem mntmEmployee_3 = new JMenuItem("Employee");
		mnRemove.add(mntmEmployee_3);
		
		JMenuItem mntmDepartment_2 = new JMenuItem("Department");
		mnRemove.add(mntmDepartment_2);
		
		JMenuItem mntmGrade_2 = new JMenuItem("Grade");
		mnRemove.add(mntmGrade_2);
		
		JMenu mnRepots = new JMenu("Repots");
		menuBar.add(mnRepots);
		
		JMenuItem mntmEmployee_2 = new JMenuItem("Employee");
		mnRepots.add(mntmEmployee_2);
		
		JMenuItem mntmDepartment_3 = new JMenuItem("Department");
		mnRepots.add(mntmDepartment_3);
		
		JMenuItem mntmGrade_3 = new JMenuItem("Grade");
		mnRepots.add(mntmGrade_3);
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
