package termProj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/** The testing suite for the backbone and GUI of the EightBall. */
public class EightBallTests {
	
	/** Tests the EightBall backbone constructor. */
	@Test
	public final void testEightBall() {
		EightBall constructorTest = new EightBall();
		assertNull("Constructor did something weird.", 
				constructorTest.getBall());
		assertEquals("Luck did something weird.", 
				constructorTest.getLuck(), 0);
	}

	/** Tests the backbone non-static shakeBall() method. */
	@Test
	public final void testShakeBall() {
		EightBall shaken = new EightBall();
		String response = null;
		response = shaken.shakeBall();
		assertNotNull("Response was not set.", response);
		assertNotEquals("Luck was not set.", shaken.getLuck(), 0);
	}

	/** Tests the backbone static shakeBall() method. */
	@Test
	public final void testShakeBallEightBall() {
		EightBall shaken2 = new EightBall();
		String response = null;
		response = EightBall.shakeBall(shaken2);
		assertNotNull("Response was not set when given parameter.",
				response);
		assertNotEquals("Luck was not set when given parameter.",
				shaken2.getLuck(), 0);
	}
	
	/** Tests the EightBall GUI. */
	@Test
	public final void testPerformed() {
		EightBallGUI perform = new EightBallGUI();
		perform.shakeButton.doClick();
		assertNotNull("Text field was not set.", perform.output);
		assertFalse(perform.imageLabel.isVisible());
		assertTrue(perform.imageLabel2.isVisible());
 
		perform.retryButton.setEnabled(true);
		perform.retryButton.doClick();
		assertNotNull("Text field was not set.", perform.output);
		assertFalse(perform.imageLabel2.isVisible());
		assertTrue(perform.imageLabel.isVisible());
		assertFalse(perform.retryButton.isEnabled());
		assertTrue(perform.shakeButton.isEnabled());
	}
}
