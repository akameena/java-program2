import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MysAWTDemo {
	static Label label;
	
	public static void main(String[] args) {
		Frame frame= new Frame();
		frame.setSize(300, 300);
		Button button= new Button("Click Me");
		Font f= new Font("Arial", Font.BOLD, 25);
		
		button.setBounds(100, 100, 170, 40);
		button.setFont(f);
		Label label1= new Label("This is Label");
		label1.setBounds(100, 40, 180, 20);
		label1.setFont(f);
		label1.setForeground(Color.CYAN);
		frame.add(label1);
		label= new Label("");
		label.setBounds(100, 160, 180, 20);
		label.setFont(f);
		label.setForeground(Color.RED);
		frame.add(label);
		ActionListener actionListener= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("Hello Java");
				label.setText("Hello Ducat");
			}
		};
		button.addActionListener(actionListener);
		frame.add(button);
		frame.setLayout(null);
		frame.setVisible(true);
		WindowAdapter adapter= new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			
				System.out.println("Bye bye");
				System.exit(0);
			}
		};
		frame.addWindowListener(adapter);
		
	}

}
