package termProj;

import static org.junit.Assert.*;

import org.junit.Test;

public class HomeGUITest {

	@Test
	public void testPerformed() {
		HomeGUI perform = new HomeGUI();
		perform.ball.doClick();
		assertNotNull("EightBallGUI error", perform.newBall);
 
		perform.dice.doClick();
		assertNotNull("DiceGUI error", perform.newDice);
		
		perform.fortune.doClick();
		assertNotNull("FortCookieGUI error", perform.newCookie);
		
		perform.numbers.doClick();
		assertNotNull("TicketGeneratorGUI error", perform.newLotto);
	}

}
