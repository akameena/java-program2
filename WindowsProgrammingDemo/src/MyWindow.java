import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow{
	JFrame frame;
	int count= 0;
	public static void main(String[] args) {
		MyWindow myWindow= new MyWindow();
		myWindow.frame.setVisible(true);
	}
	
	public MyWindow() {
		// TODO Auto-generated constructor stub
	frame= new JFrame();
	frame.getContentPane().setEnabled(false);
	frame.setBounds(300, 300, 300, 300);
	frame.getContentPane().setLayout(null);
	
	final JButton btnNewButton = new JButton();
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (count== 0) {
				btnNewButton.setIcon(new ImageIcon("C:\\Users\\John\\Desktop\\New folder (6)\\Design Language\\pic_bulbon.gif"));
				count= 1;
			}
			else {
				btnNewButton.setIcon(new ImageIcon("C:\\Users\\John\\Desktop\\New folder (6)\\Design Language\\pic_bulboff.gif"));
				count= 0;
			}
			
			
		}
	});
	btnNewButton.setIcon(new ImageIcon("C:\\Users\\John\\Desktop\\New folder (6)\\Design Language\\pic_bulboff.gif"));
	//btnNewButton.setForeground(new Color(144, 238, 144));
	btnNewButton.setBounds(100, 56, 106, 179);
//	btnNewButton.setBackground(Color.RED);
	frame.getContentPane().add(btnNewButton);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}