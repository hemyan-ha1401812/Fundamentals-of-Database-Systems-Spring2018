import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class signIN extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signIN frame = new signIN();
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
	public signIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setBounds(30, 41, 103, 14);
		contentPane.add(lblCustomerId);
		
		textField = new JTextField();
		textField.setBounds(193, 38, 193, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(30, 98, 46, 14);
		contentPane.add(lblPassword);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.setBounds(30, 203, 89, 23);
		contentPane.add(btnSignIn);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(265, 203, 89, 23);
		contentPane.add(btnExit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(190, 95, 196, 20);
		contentPane.add(passwordField);
	}
}
