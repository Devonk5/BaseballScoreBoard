import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

/**  
* Devon Keuning - dlkeuning@dmacc.edu
* CIS171 31099
* Jul 21, 2022
* Operating System version
*/
public class ScoreBoardDrawing extends JComponent{
	
	
	Color outColor = Color.gray;
	Color baseColor = Color.white;		
	
	public void paintComponent(Graphics g) {
		
		
		g.setColor(baseColor);
		g.fillRoundRect(10, 10, 180, 180,50,50);
		g.setColor(outColor);
		g.drawRoundRect(10, 10, 180, 180,50,50);
		g.fillOval(20,80,50,50);
		g.setColor(baseColor);
		g.fillOval(30,90,30,30);
		g.setColor(outColor);
		g.fillRoundRect(85, 80, 40, 50,20,20);
		g.setColor(baseColor);
		g.fillRoundRect(95, 50, 20, 70,10,10);
		g.setColor(outColor);
		g.fillRect(150, 80, 12, 50);
		g.fillRect(135, 80, 42, 12);
		
		
	}
	public void changeColors() {
		int seven = 7;
		int one = 1;
		int randNum1 = (int) (one + Math.random()*seven);
		if (randNum1 == 1) {
			outColor = Color.blue;
		}
		else if (randNum1 == 2) {
			outColor = Color.green;
		}
		else if (randNum1 == 3) {
			outColor = Color.magenta;
		}
		else if (randNum1 == 4) {
			outColor = Color.red;
		}
		else if (randNum1 == 5) {
			outColor = Color.pink;
		}
		else if (randNum1 == 6) {
			outColor = Color.yellow;
		}
		else if (randNum1 == 7) {
			outColor = Color.cyan;
		}
		int randNum2 = (int) (one + Math.random()*seven);
		while (randNum1 == randNum2) {
			randNum2 = (int) (one + Math.random()*seven);
		}
		if (randNum2 == 1) {
			baseColor = Color.blue;
		}
		else if (randNum2 == 2) {
			baseColor = Color.green;
		}
		else if (randNum2 == 3) {
			baseColor = Color.magenta;
		}
		else if (randNum2 == 4) {
			baseColor = Color.red;
		}
		else if (randNum2 == 5) {
			baseColor = Color.pink;
		}
		else if (randNum2 == 6) {
			baseColor = Color.yellow;
		}
		else if (randNum2 == 7) {
			baseColor = Color.cyan;
		}
		repaint();
	}
	public void resetColors() {
		baseColor = Color.white;
		outColor = Color.gray;
		repaint();
	}

}
