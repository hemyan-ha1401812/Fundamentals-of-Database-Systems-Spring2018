package Lab_11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class mainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();
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
	public mainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("New");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmEmp = new JMenuItem("Emp");
		mntmEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewEmp newEmp = new NewEmp();
				newEmp.setVisible(true);
				newEmp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnNewMenu.add(mntmEmp);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Dept");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmGrade = new JMenuItem("Grade");
		mnNewMenu.add(mntmGrade);
		
		JMenu mnUpdate = new JMenu("Update");
		menuBar.add(mnUpdate);
		
		JMenuItem mntmEmp_1 = new JMenuItem("Emp");
		mnUpdate.add(mntmEmp_1);
		
		JMenuItem mntmDept = new JMenuItem("Dept");
		mnUpdate.add(mntmDept);
		
		JMenuItem mntmGrade_1 = new JMenuItem("Grade");
		mnUpdate.add(mntmGrade_1);
		
		JMenu mnRemove = new JMenu("Remove");
		menuBar.add(mnRemove);
		
		JMenuItem mntmEmp_2 = new JMenuItem("Emp");
		mnRemove.add(mntmEmp_2);
		
		JMenuItem mntmDept_1 = new JMenuItem("Dept");
		mnRemove.add(mntmDept_1);
		
		JMenuItem mntmGrade_2 = new JMenuItem("Grade");
		mnRemove.add(mntmGrade_2);
		
		JMenu mnReports = new JMenu("Reports");
		menuBar.add(mnReports);
		
		JMenu mnExit = new JMenu("Exit");
		mnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		menuBar.add(mnExit);
	}
}
