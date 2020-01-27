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


public class Search extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblName;
	private JTextField textField_1;
	private JLabel lblLoc;
	private JTextField textField_2;
	private JButton btnSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
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
	public Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeptNo = new JLabel("Dept No");
		lblDeptNo.setBounds(69, 43, 46, 14);
		contentPane.add(lblDeptNo);
		
		textField = new JTextField();
		textField.setBounds(160, 40, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblName = new JLabel("Name");
		lblName.setBounds(69, 68, 46, 14);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 65, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		lblLoc = new JLabel("Loc");
		lblLoc.setBounds(69, 93, 46, 14);
		contentPane.add(lblLoc);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 90, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false);
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DBOperation dbo = new DBOperation();
				String result[]=dbo.getDeptData(Integer.parseInt(textField.getText()));
				if (result[0]==null){
					textField_1.setText("");
					textField_2.setText("");
					JOptionPane.showMessageDialog(null, "Dept not found");}
				else{
				textField_1.setText(result[0]);
				textField_2.setText(result[1]);
				JOptionPane.showMessageDialog(null, "DONE");
				}
			}
		});
		btnSearch.setBounds(314, 39, 89, 23);
		contentPane.add(btnSearch);
	}

}
