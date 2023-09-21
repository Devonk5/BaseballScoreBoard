import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//i

/**  
* Devon Keuning - dlkeuning@dmacc.edu
* CIS171 31099
* Jul 20, 2022
* Operating System version
*/
public class ScoreBoardPanel extends JPanel{
	//allows access to the given class
	ScoreBoard sb = new ScoreBoard();
	//allows access to the given class
	ScoreBoardDrawing sbd = new ScoreBoardDrawing();
	//collects return of InningSetterMethod
	int setInning = sb.Inningsetter();
	/*
	 * creates JVariables that is shown on panel
	 */
	private JTextField stadiumNameField = new JTextField(10);
	private JLabel fieldLabel = new JLabel("Field Name: ");
	private JButton clearButton = new JButton("          clear          ");
	private JButton homePlusButton = new JButton("+");
	private JButton homeMinusButton = new JButton("-");
	private JButton awayMinusButton = new JButton("-");
	private JButton awayPlusButton = new JButton("+");
	private JButton inningPlusButton = new JButton("+");
	private JButton inningMinusButton = new JButton("-");
	private JButton outButton = new JButton("out color");
	private JLabel inningLabel = new JLabel("                    inning {" + setInning + "}                    ");
	private JLabel homeScoreLabel = new JLabel("   Home: {" + sb.getHome() + "}  ");
	private JLabel awayScoreLabel = new JLabel("     Away {" + sb.getAway() + "} ");

	
	/*
	 * adds JVariables to panel
	 * attaches buttons to action listeners
	 */
	public ScoreBoardPanel() {
		sb.setInning(setInning);
		sbd.setPreferredSize(new Dimension(200,200));
		add(fieldLabel);
		add(stadiumNameField);
		add(homeScoreLabel);
		add(awayScoreLabel);
		homePlusButtonListener homePlus = new homePlusButtonListener();
		homePlusButton.addActionListener(homePlus);
		add(homePlusButton);
		homeMinusButtonListener homeMinus = new homeMinusButtonListener();
		homeMinusButton.addActionListener(homeMinus);
		add(homeMinusButton);
		awayPlusButtonListener awayPlus = new awayPlusButtonListener();
		awayPlusButton.addActionListener(awayPlus);
		add(awayPlusButton );
		awayMinusButtonListener awayMinus = new awayMinusButtonListener();
		awayMinusButton.addActionListener(awayMinus);
		add(awayMinusButton);
		add(inningLabel);
		inningPlusButtonListener inningPlus = new inningPlusButtonListener();
		inningPlusButton.addActionListener(inningPlus);
		add(inningPlusButton);
		inningMinusButtonListener inningMinus = new inningMinusButtonListener();
		inningMinusButton.addActionListener(inningMinus);
		add(inningMinusButton);
		clearButtonListener clear = new clearButtonListener();
		clearButton.addActionListener(clear);
		add(clearButton);
		add(sbd);
		outButtonListener out = new outButtonListener();
		outButton.addActionListener(out);
		add(outButton);
		
	}
	/*
	 * adds 1 to home score if the button is clicked
	 */
	class homePlusButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			sb.HomePlus();
			homeScoreLabel.setText("   Home: {" + sb.getHome() + "}  ");
		}
	}
	/*
	 * minuses 1 to home score if the button is clicked
	 */
	class homeMinusButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			sb.HomeMinus();
			homeScoreLabel.setText("   Home: {" + sb.getHome() + "}  ");
		}
	}
	/*
	 * adds 1 to away score if the button is clicked
	 */
	class awayPlusButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			sb.AwayPlus();
			awayScoreLabel.setText("     Away {" + sb.getAway() + "} ");
		}
	}
	/*
	 * minuses 1 to away score if the button is clicked
	 */
	class awayMinusButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			sb.AwayMinus();
			awayScoreLabel.setText("     Away {" + sb.getAway() + "} ");
		}

	}
	/*
	 * adds 1 to inning if the button is clicked
	 */
	class inningPlusButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			sb.InningPlus();
			inningLabel.setText("                    inning {" + sb.getInning() + "}                    ");
		}
	}
	/*
	 * minuses 1 to inning if the button is clicked
	 */
	class inningMinusButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			sb.InningMinus();
			inningLabel.setText("                    inning {" + sb.getInning() + "}                    ");
		}

	}
	/*
	 * resets all variables if
	 */
	class clearButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			sb.ClearBoard();
			sbd.resetColors();
			stadiumNameField.setText("");
			inningLabel.setText("                    inning {" + sb.getInning() + "}                    ");
			awayScoreLabel.setText("     Away {" + sb.getAway() + "} ");
			homeScoreLabel.setText("   Home: {" + sb.getHome() + "}  ");
		}

	}
	/*
	 * allows colors of drawing change when the button is pressed
	 */
	class outButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			sbd.changeColors();
		}
	}
}	
