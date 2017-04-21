package termProj;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.awt.Color;
import org.junit.Test;

/** A testing suite for the Home page of the Digital Fortune Teller. */
public class HomeGUITest {

	/** Tests the EightBall, Dice, FortCookie, and TicketGenerator
	 * within the HomeGUI to ensure the proper connections were made. */
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
		
		perform.name.doClick();
		assertNotNull("Name error", perform.name);
		
		perform.rune.doClick();
		assertNotNull("Rune error", perform.rune);
		
		perform.luck.doClick();
		assertEquals(perform.getLuck(), perform.newBall.globalBall.getLuck() + perform.newDice.newDie.getLuck() +
				perform.newCookie.global.getLuck() + perform.newName.getLuck() + perform.newRune.runes.getLuck());
		assertNotNull("Output error", perform.output);
	}
	
	/** Tests the personalization options. */
	@Test
	public void testPerformedColors() {
		HomeGUI perform = new HomeGUI();
		perform.color.doClick();
		if (perform.colour == perform.options[0].toString()) {
			assertEquals("Red color error",
					perform.color.getBackground(),
					new Color(125, 0, 0));
			assertEquals("Text color error",
					perform.color.getForeground(),
					Color.WHITE);
			assertEquals("Red color error",
					perform.luck.getBackground(),
					new Color(125, 0, 0));
			assertEquals("Text color error",
					perform.luck.getForeground(),
					Color.WHITE);
			assertEquals("Red color error",
					perform.dice.getBackground(),
					new Color(125, 0, 0));
			assertEquals("Text color error", 
					perform.dice.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.ball.getBackground(),
					new Color(125, 0, 0));
			assertEquals("Text color error", 
					perform.ball.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.fortune.getBackground(),
					new Color(125, 0, 0));
			assertEquals("Text color error", 
					perform.fortune.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.numbers.getBackground(),
					new Color(125, 0, 0));
			assertEquals("Text color error", 
					perform.numbers.getForeground(),
					Color.WHITE);
			assertEquals("Red color error",
					perform.name.getBackground(),
					new Color(125, 0, 0));
			assertEquals("Text color error",
					perform.name.getForeground(),
					Color.WHITE);
			assertEquals("Red color error",
					perform.rune.getBackground(),
					new Color(125, 0, 0));
			assertEquals("Text color error",
					perform.rune.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.output.getBackground(),
					new Color(125, 0, 0));
			assertEquals("Text color error", 
					perform.output.getForeground(),
					Color.WHITE);
		}
		
		if (perform.colour == perform.options[1].toString()) {
			assertEquals("Red color error", 
					perform.color.getBackground(),
					new Color(0, 125, 0));
			assertEquals("Text color error", 
					perform.color.getForeground(),
					Color.WHITE);
			assertEquals("Red color error",
					perform.luck.getBackground(),
					new Color(0, 125, 0));
			assertEquals("Text color error",
					perform.luck.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.dice.getBackground(),
					new Color(0, 125, 0));
			assertEquals("Text color error", 
					perform.dice.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.ball.getBackground(),
					new Color(0, 125, 0));
			assertEquals("Text color error", 
					perform.ball.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.fortune.getBackground(),
					new Color(0, 125, 0));
			assertEquals("Text color error", 
					perform.fortune.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.numbers.getBackground(),
					new Color(0, 125, 0));
			assertEquals("Text color error", 
					perform.numbers.getForeground(),
					Color.WHITE);
			assertEquals("Red color error",
					perform.name.getBackground(),
					new Color(0, 125, 0));
			assertEquals("Text color error",
					perform.name.getForeground(),
					Color.WHITE);
			assertEquals("Red color error",
					perform.rune.getBackground(),
					new Color(0, 125, 0));
			assertEquals("Text color error",
					perform.rune.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.output.getBackground(),
					new Color(0, 125, 0));
			assertEquals("Text color error", 
					perform.output.getForeground(),
					Color.WHITE);
		}
		
		if (perform.colour == perform.options[2].toString()) {
			assertEquals("Red color error", 
					perform.color.getBackground(),
					new Color(0, 0, 125));
			assertEquals("Text color error", 
					perform.color.getForeground(),
					Color.WHITE);
			assertEquals("Red color error",
					perform.luck.getBackground(),
					new Color(0, 0, 125));
			assertEquals("Text color error",
					perform.luck.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.dice.getBackground(),
					new Color(0, 0, 125));
			assertEquals("Text color error", 
					perform.dice.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.ball.getBackground(),
					new Color(0, 0, 125));
			assertEquals("Text color error", 
					perform.ball.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.fortune.getBackground(),
					new Color(0, 0, 125));
			assertEquals("Text color error", 
					perform.fortune.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.numbers.getBackground(),
					new Color(0, 0, 125));
			assertEquals("Text color error", 
					perform.numbers.getForeground(),
					Color.WHITE);
			assertEquals("Red color error",
					perform.name.getBackground(),
					new Color(0, 0, 125));
			assertEquals("Text color error",
					perform.name.getForeground(),
					Color.WHITE);
			assertEquals("Red color error",
					perform.rune.getBackground(),
					new Color(0, 0, 125));
			assertEquals("Text color error",
					perform.rune.getForeground(),
					Color.WHITE);
			assertEquals("Red color error", 
					perform.output.getBackground(),
					new Color(0, 0, 125));
			assertEquals("Text color error", 
					perform.output.getForeground(),
					Color.WHITE);
		}
	}		
}
