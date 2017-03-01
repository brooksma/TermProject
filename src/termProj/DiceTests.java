package termProj;

import static org.junit.Assert.*;

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

}
