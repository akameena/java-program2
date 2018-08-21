import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


public class CalculatorJava {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	JLabel lblNewLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorJava window = new CalculatorJava();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorJava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPleaseEnterValue = new JLabel("Please enter value1");
		lblPleaseEnterValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseEnterValue.setBounds(57, 40, 123, 14);
		frame.getContentPane().add(lblPleaseEnterValue);
		
		JLabel lblPleaseEnterValue_1 = new JLabel("Please enter value2");
		lblPleaseEnterValue_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseEnterValue_1.setBounds(249, 40, 134, 14);
		frame.getContentPane().add(lblPleaseEnterValue_1);
		
		textField = new JTextField();
		textField.setBounds(57, 65, 123, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(249, 65, 123, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				String s1= textField.getText();
				int a= Integer.parseInt(s1);
				String s2= textField_1.getText();
				int b= Integer.parseInt(s2);
				int c= a+b;
				lblNewLabel.setText("Result is: "+c);
				}
				catch(Exception exception){
					lblNewLabel.setText("");
					JOptionPane.showMessageDialog(btnAdd,
							"Exception is: "+exception);
							
							}
				
			}
		});
		btnAdd.setForeground(Color.GREEN);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setBounds(57, 102, 123, 23);
		frame.getContentPane().add(btnAdd);
		
		final JButton btnNewButton = new JButton("Sub");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String s1= textField.getText();
					int a= Integer.parseInt(s1);
					String s2= textField_1.getText();
					int b= Integer.parseInt(s2);
					int c= a-b;
					lblNewLabel.setText("Result is: "+c);
					}
					catch(Exception exception){
						lblNewLabel.setText("");
					//	JOptionPane.showMessageDialog(btnNewButton,
					//	"Exception is: "+exception);
					//	String val= JOptionPane.showInputDialog("Please enter value again only in number");
					//	lblNewLabel.setText(""+val);
					//	textField_1.setText(val);
						int cc= JOptionPane.showConfirmDialog(btnNewButton, "Do u want to exit?");
						if (cc== 0) {
							//System.out.println("A");
							System.exit(0);
						}
						else if (cc== 1) {
							System.out.println("B");
						}
						else if (cc== 2) {
						//	System.out.println("C");
						}
					}
			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(249, 102, 123, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(57, 159, 315, 14);
		frame.getContentPane().add(lblNewLabel);
		
		final JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(20, 18, 32, 2));
		spinner.setBounds(178, 185, 71, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblPleaseEnterAge = new JLabel("Please enter Age");
		lblPleaseEnterAge.setForeground(Color.GREEN);
		lblPleaseEnterAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseEnterAge.setBounds(57, 184, 111, 18);
		frame.getContentPane().add(lblPleaseEnterAge);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Age is: "+spinner.getValue());
			}
		});
		btnNewButton_1.setBounds(287, 184, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnMoveToNext = new JButton("Move to next Page");
		lblPleaseEnterValue.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				System.out.println("kkk");
			}
		});
		btnMoveToNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecFrame frame1= new SecFrame();
				frame1.setBounds(300, 300, 300, 300);
				frame1.setVisible(true);
				frame.dispose();
			}
		});
		btnMoveToNext.setBounds(57, 228, 192, 23);
		frame.getContentPane().add(btnMoveToNext);
	}
}
