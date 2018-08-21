import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;


public class AppletDemo extends Applet{
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.BLUE);
		g.drawLine(10, 10, 50, 50);
		Image img= getImage(getDocumentBase(), "a.png");
		g.setColor(Color.GREEN);
		g.drawRect(202, 102, img.getWidth(this)+4, img.getHeight(this)+4);
		g.setColor(Color.BLUE);
		g.fillRect(100, 100, 49, 49);
		g.fillOval(50, 100, 50, 30);
		g.fillArc(200, 50, 50, 40, 0, 270);
		Font font= new Font("Arial", Font.BOLD, 25);
		g.setFont(font);
		g.drawString("Hello Java", 50, 200);
		
		g.drawImage(img, 200, 100, img.getWidth(this), img.getHeight(this), this);
	}

}
