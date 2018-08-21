import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JButton;

import com.sun.xml.internal.ws.api.server.Container;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LayoutDemo {

	private JFrame frame;
	JButton btnSubmitMe;
	JButton btnFindMe;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutDemo window = new LayoutDemo();
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
	public LayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final CardLayout cardLayout= new CardLayout(0, 0);
		frame.getContentPane().setLayout(cardLayout);
		final java.awt.Container container= frame.getContentPane();
		final JButton btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(container);
			}
		});
		
		btnSubmitMe = new JButton("Submit Me");
		btnSubmitMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.previous(container);
			}
		});
		
		btnFindMe = new JButton("Find Me");
		btnFindMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(container);
			}
		});
		frame.getContentPane().add(btnFindMe, "name_92635250773604");
		frame.getContentPane().add(btnSubmitMe, "name_92623395006970");
		frame.getContentPane().add(btnClickMe, "name_92612555271257");
	//	frame.getContentPane().setLayout(new BorderLayout(10, 10));
		
		//frame.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
		
	
	//	frame.getContentPane().setLayout(null);
	}

}
