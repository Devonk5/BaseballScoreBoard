import javax.swing.JFrame;
import javax.swing.JPanel;
/**  
* Devon Keuning - dlkeuning@dmacc.edu
* CIS171 31099
* Jul 20, 2022
* Operating System version
*/
public class ScoreboardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * creates the frame and panel
		 */
		JFrame frame = new JFrame();
		JPanel panel = new ScoreBoardPanel(); 
		frame.add(panel);
		frame.setSize(200,450);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
