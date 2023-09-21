import java.util.Scanner;

/**  
* Devon Keuning - dlkeuning@dmacc.edu
* CIS171 31099
* Jul 20, 2022
* Operating System version
*/
public class ScoreBoard {
	/*
	 * sets variables used in other classes
	 */
	int home;
	int away;
	int inning;
	/*
	 * sets defaults for variables
	 */
	public ScoreBoard() {
		setHome(0);
		setAway(0);
		setInning(0);
	}
	/**
	 * @return the home
	 */
	public int getHome() {
		return home;
	}
	/**
	 * @param home the home to set
	 */
	public void setHome(int home) {
		this.home = home;
	}
	/**
	 * @return the away
	 */
	public int getAway() {
		return away;
	}
	/**
	 * @param away the away to set
	 */
	public void setAway(int away) {
		this.away = away;
	}
	/**
	 * @return the inning
	 */
	public int getInning() {
		return inning;
	}
	/**
	 * @param inning the inning to set
	 */
	public void setInning(int inning) {
		this.inning = inning;
	}
	/*
	 * adds 1 to given variable
	 */
	public void HomePlus() {
		setHome(home+1);
	}
	public void AwayPlus() {
		setAway(away+1);
	}
	public void InningPlus() {
		setInning(inning+1);
		/*
		 * minuses 1 from given variable
		 */
	}
	public void HomeMinus() {
		if (home == 0) {
			setHome(0);
		}
		else {
		setHome(home-1);
		}
	}
	public void AwayMinus() {
		if (away == 0) {
			setAway(0);
		}
		else {
		setAway(away-1);
		}
	}
	public void InningMinus() {
		if (inning == 0) {
			setInning(0);
		}
		else {
		setInning(inning-1);
		}
	}
	/*
	 * allows user to decide which inning they'd like to start in
	 */
	public int Inningsetter() {
		System.out.print("what inning is it? ");
		Scanner sc = new Scanner(System.in);
		int inning;
		if (sc.hasNextInt()) {
			inning = sc.nextInt();
		}
		else {
			System.out.print("Incorrect input: setting inning to 1 "
					+ "use the + and - if changes are required");
			inning = 1;
		}
		sc.close();
		return inning;
	}
	/*
	 * resets variables
	 */
	public void ClearBoard() {
		setHome(0);
		setAway(0);
		setInning(0);
	}
}
