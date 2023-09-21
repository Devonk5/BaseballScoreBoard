import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Devon Keuning - dlkeuning@dmacc.edu
* CIS171 31099
* Jul 22, 2022
* Operating System version
*/
class ScoreBoardTest {

	@Test
	void test() {
		
		
		
		ScoreBoard test = new ScoreBoard();
		
		
		
		test.setAway(4);
		/*
		 * tests awayPlus method
		 */
		test.AwayPlus();
		assertEquals(5, test.getAway());
		test.AwayPlus();
		assertEquals(6, test.getAway());
		test.AwayPlus();
		assertEquals(7, test.getAway());
		
		
		
		/*
		 * tests awayMinus method
		 */
		test.AwayMinus();
		assertEquals(6, test.getAway());
		test.AwayMinus();
		assertEquals(5, test.getAway());
		test.AwayMinus();
		assertEquals(4, test.getAway());
		
		
		
		test.setHome(4);
		/*
		 * tests homePlus method
		 */
		test.HomePlus();
		assertEquals(5, test.getHome());
		test.HomePlus();
		assertEquals(6, test.getHome());
		test.HomePlus();
		assertEquals(7, test.getHome());
		
		
		
		/*
		 * tests homeMinus method
		 */
		test.HomeMinus();
		assertEquals(6, test.getHome());
		test.HomeMinus();
		assertEquals(5, test.getHome());
		test.HomeMinus();;
		assertEquals(4, test.getHome());
		
		
		
		test.setInning(4);
		/*
		 * tests homePlus method
		 */
		test.InningPlus();
		assertEquals(5, test.getInning());
		test.InningPlus();
		assertEquals(6, test.getInning());
		test.InningPlus();
		assertEquals(7, test.getInning());
		
		
		
		/*
		 * tests homeMinus method
		 */
		test.InningMinus();
		assertEquals(6, test.getInning());
		test.InningMinus();
		assertEquals(5, test.getInning());
		test.InningMinus();
		assertEquals(4, test.getInning());
	}

}
