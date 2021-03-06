import java.awt.BorderLayout;
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

public class Classes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	ClassesConn cla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classes frame = new Classes();
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
	public Classes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblShowClasses = new JLabel("Show Classes (Y / N)");
		lblShowClasses.setBounds(10, 11, 131, 14);
		contentPane.add(lblShowClasses);
		textField = new JTextField();
		textField.setBounds(162, 8, 86, 20);
		
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){ 
			ArrayList<ClassesAttributes> c = null;
				String text= textField.getText();
				if (text.equals("N")||text.equals("n")){
					dispose();
				
				}
				else{
					
					if(text.equals("Y")||text.equals("y")){
						c = cla.getAll();
						
					}
					ClassesTable model = new ClassesTable(c);
					table.setModel(model);
				}
				}
		
		});
		
		
		btnSearch.setBounds(286, 7, 89, 23);
		contentPane.add(btnSearch);
		
		table = new JTable();
		table.setBounds(10, 41, 414, 209);
		contentPane.add(table);
	}

}
