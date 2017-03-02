package termProj;

import static org.junit.Assert.*;

import javax.swing.ImageIcon;

import org.junit.Test;

public class DiceTests {

	@Test
	public final void testDice() {
		Dice constructorTest = new Dice();
		assertNotNull(constructorTest.die);
		assertEquals(constructorTest.die, 1);
	}

	@Test
	public final void testRoll() {
		Dice rollTest = new Dice();
		assertNotNull(Dice.roll(rollTest));
		assertNotEquals(Dice.roll(rollTest), 0);
		assertNotEquals(Dice.roll(rollTest), 0);
		assertNotEquals(Dice.roll(rollTest), 0);
	}
	
	@Test
	public final void testRoll2() {
		Dice rollTest = new Dice();
		assertNotNull(rollTest.roll());
		assertNotEquals(rollTest.roll(), 0);
		assertNotEquals(rollTest.roll(), 0);
		assertNotEquals(rollTest.roll(), 0);
	}
	
	@Test
	public final void testPerformed() {
		DiceGUI perform = new DiceGUI();
		perform.rollButton.doClick();
		assertEquals("Image one error", perform.die0Image, perform.image0Label.getIcon());
		assertEquals("Image two error", perform.die1Image, perform.image1Label.getIcon());
		if(perform.die0 == 1 && perform.die1 == 1){
			assertTrue(perform.fireLabel.isVisible());
			assertTrue(perform.output.isVisible());
		}
	}
}