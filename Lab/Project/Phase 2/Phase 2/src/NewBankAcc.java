import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewBankAcc extends JFrame {

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
					NewBankAcc frame = new NewBankAcc();
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
	public NewBankAcc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBankName = new JLabel("Bank Name");
		lblBankName.setBounds(23, 40, 100, 14);
		contentPane.add(lblBankName);
		
		textField = new JTextField();
		textField.setBounds(175, 37, 217, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Amount");
		lblNewLabel.setBounds(23, 82, 100, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(175, 79, 217, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("AccNum");
		lblNewLabel_1.setBounds(23, 138, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(175, 135, 217, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0){
			Bank_Acc_Operation bAccOp = new Bank_Acc_Operation();
			String bName  = textField.getText();
			double amount = Double.parseDouble(textField_1.getText());
			int accNum = Integer.parseInt(textField_2.getText());
			bAccOp.insertIntoBankAcc(bName, amount, accNum);
			JOptionPane.showMessageDialog(null, "DONE");
			bAccOp.close();
		}
		});
		
		
		btnAdd.setBounds(45, 216, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setBounds(239, 216, 89, 23);
		contentPane.add(btnExit);
	}

}
