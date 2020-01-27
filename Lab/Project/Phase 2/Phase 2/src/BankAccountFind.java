
// TO DO SIMMILAR TO LAB 10 // DISPLAY DATA
//BANK ACCOUNT 

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

public class BankAccountFind extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	Bank_Acc_Operation b = new Bank_Acc_Operation();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankAccountFind frame = new BankAccountFind();
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
	public BankAccountFind() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setBounds(10, 11, 110, 14);
		contentPane.add(lblAccountNumber);
		
		textField = new JTextField();
		textField.setBounds(150, 8, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<bankAccount> ba;
				int na = Integer.parseInt(textField.getText());
				ba= b.search(na);
				table.setModel(new bankAccountTable(ba));
			
			}
			});
		
		btnSearch.setBounds(335, 7, 89, 23);
		contentPane.add(btnSearch);
		
		table = new JTable();
		table.setBounds(10, 41, 414, 209);
		contentPane.add(table);
	}
}
