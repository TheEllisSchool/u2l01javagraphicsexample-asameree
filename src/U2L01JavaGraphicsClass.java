import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class U2L01JavaGraphicsClass extends JPanel {
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Canvas");
		// close when i hit the x
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    U2L01JavaGraphicsClass panel = new U2L01JavaGraphicsClass();
	    Color white = new Color (255, 255, 255);
	    frame.setBackground(white);
	    // inherating a panel
	    frame.add(panel);
	    // sets the size of the window
	    frame.setSize(300, 200);
	    
	    frame.setVisible(true);

	}
	 //protected void paintComponent1(Graphics g) {
	        
	//}
	public void paintComponent(Graphics g){
		Color red = new Color (255, 66, 66);
		super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 = red;
        Color color2 = Color.PINK;
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
		/*g.setColor(mintyBreeze);
		g.drawLine(0,0,50,50); 
		g.setColor(Color.CYAN);
		g.drawLine(50,0,50,75);
		*/
		//Color white = new Color (255, 255, 255);
		Color pinkWhite = new Color (250, 210, 210);
		Color cherryRed = new Color (255, 74, 74);
		Color greenStem = new Color (130, 245, 113);
		Color red2 = new Color (204, 51, 51);
		Color red1 = new Color (173, 42, 42);
		g.setColor(red2);
		g.fillOval(93,46,101,101);
		g.setColor(pinkWhite);
	
		g.fillOval(91,45,100,100);
		g.setColor(cherryRed);
		g.fillOval(115,100,20,20);
		g.fillOval(150,95,20,20);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(2));
		g.setColor(greenStem);
		g.drawArc(120, 70, 45, 63, 10, 175);
		//g.fillOval(135,65,7,7);
		g.setColor(red1);
		g.setFont(new Font("Footlight MT Light", Font.BOLD,32));
		g.drawString("Cherry Bomb", 48,31);
		g.setColor(Color.white);
		g.drawString("Cherry Bomb", 45,30);
		
	}
}

