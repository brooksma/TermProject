package termProj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * The testing suite for the Dice module and backbone.
 * @author Natasha Speck, Bridget Bieneik
 */
public class DiceTests {

	/** Testing the backbone code constructor. */
	@Test
	public final void testDice() {
		Dice constructorTest = new Dice();
		assertNotNull(constructorTest.getDie());
		assertEquals(constructorTest.getDie(), 1);
	}

	/** Testing the fetch luck method. */
	@Test
	public final void testGetLuck() {
		Dice constructorTest = new Dice();
		assertNotNull(constructorTest.getLuck());
		assertEquals(constructorTest.getLuck(), 0);
	}

	/** Testing the backbone code's static <code>roll()</code> method. */
	@Test
	public final void testRoll() {
		Dice rollTest = new Dice();
		assertNotNull(Dice.roll(rollTest));
		assertNotEquals(Dice.roll(rollTest), 0);
		assertNotEquals(Dice.roll(rollTest), 0);
		assertNotEquals(Dice.roll(rollTest), 0);
	}

	/** Testing the backbone code's non-static <code>roll()</code>
	 * method. */
	@Test
	public final void testRoll2() {
		Dice rollTest = new Dice();
		assertNotNull(rollTest.roll());
		assertNotEquals(rollTest.roll(), 0);
		assertNotEquals(rollTest.roll(), 0);
		assertNotEquals(rollTest.roll(), 0);
	}

	/** Testing the DiceGUI. */
	@Test
	public final void testPerformed() {
		DiceGUI perform = new DiceGUI();
		perform.rollButton.doClick();
		assertEquals("Image one error", perform.die0Image,
				perform.image0Label.getIcon());
		assertEquals("Image two error", perform.die1Image,
				perform.image1Label.getIcon());
		if (perform.getDie0() == 1 && perform.getDie1() == 1) {
			assertTrue(perform.fireLabel.isVisible());
			assertTrue(perform.output.isVisible());
			assertEquals(perform.newDie.getLuck(), 1);
			}
		}

}
