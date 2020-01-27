// CUSTOMER REGESTRATION 

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class signUP extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUP frame = new signUP();
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
	public signUP() {
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
		textField.setBounds(174, 8, 213, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBankName = new JLabel("Bank Name");
		lblBankName.setBounds(10, 39, 110, 14);
		contentPane.add(lblBankName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 39, 213, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setBounds(10, 74, 110, 14);
		contentPane.add(lblCustomerName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(174, 70, 213, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCustomerEmail = new JLabel("Customer Email");
		lblCustomerEmail.setBounds(10, 107, 110, 14);
		contentPane.add(lblCustomerEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(174, 101, 213, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCustomerMobile = new JLabel("Customer Mobile");
		lblCustomerMobile.setBounds(10, 132, 110, 14);
		contentPane.add(lblCustomerMobile);
		
		textField_4 = new JTextField();
		textField_4.setBounds(174, 132, 213, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(48, 227, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setBounds(244, 227, 89, 23);
		contentPane.add(btnExit);
		
		JLabel lblCustomerid = new JLabel("CustomerID");
		lblCustomerid.setBounds(10, 168, 100, 14);
		contentPane.add(lblCustomerid);
		
		textField_5 = new JTextField();
		textField_5.setBounds(174, 165, 213, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 202, 110, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 196, 213, 20);
		contentPane.add(passwordField);
	}
}
