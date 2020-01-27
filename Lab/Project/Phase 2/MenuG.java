import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MenuG extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuG frame = new MenuG();
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
	public MenuG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCustomer = new JMenu("Customer");
		menuBar.add(mnCustomer);
		
		JMenuItem mntmSignIn = new JMenuItem("Sign in ");
		mnCustomer.add(mntmSignIn);
		
		JMenuItem mntmSignUp = new JMenuItem("Sign Up");
		mnCustomer.add(mntmSignUp);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("C Info");
		mnCustomer.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("C Orders");
		mnCustomer.add(mntmNewMenuItem_4);
		
		JMenuItem mntmCPurchases = new JMenuItem("C purchases");
		mnCustomer.add(mntmCPurchases);
		
		JMenu mnNewMenu = new JMenu("BankAccount");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewbaccMenuItem = new JMenuItem("BanAcc");
		mnNewMenu.add(mntmNewbaccMenuItem);
		
		JMenuItem mntmNewba = new JMenuItem("NewBA");
		mnNewMenu.add(mntmNewba);
		
		JMenu mnItem = new JMenu("Item");
		menuBar.add(mnItem);
		
		JMenuItem mntmItm = new JMenuItem("Itm");
		mnItem.add(mntmItm);
		
		JMenuItem mntmInventory = new JMenuItem("InventoryU");
		mnItem.add(mntmInventory);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("purchProduct");
		mnItem.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sales");
		mnItem.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("PlaceOrder");
		mnItem.add(mntmNewMenuItem_2);
		
		JMenuItem mntmSupplier = new JMenuItem("Supplier");
		mnItem.add(mntmSupplier);
		
		JMenuItem mntmClasses = new JMenuItem("Classes");
		mnItem.add(mntmClasses);
		
		JMenu mnBill = new JMenu("Bill");
		menuBar.add(mnBill);
		
		JMenuItem mntmDisplaybill = new JMenuItem("DisplayBill");
		mnBill.add(mntmDisplaybill);
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
