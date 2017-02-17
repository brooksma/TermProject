package termProj;

import static org.junit.Assert.*;
import org.junit.Test;

public class EightBallTests {
	
	@Test
	public final void testEightBall() {
		EightBall constructorTest = new EightBall();
		assertNull("Constructor did something weird.", constructorTest.ball);
		assertEquals("Luck did something weird.", constructorTest.luckyCounter, 0);
	}

	@Test
	public final void testResetLuck() {
		EightBall luckTest = new EightBall();
		luckTest.shakeBall();
		luckTest.resetLuck();
		assertEquals("Luck did not reset." , luckTest.luckyCounter, 0);
	}

	@Test
	public final void testShakeBall() {
		EightBall shaken = new EightBall();
		String response = null;
		response = shaken.shakeBall();
		assertNotNull("Response was not set." , response);
		assertNotEquals("Luck was not set." , shaken.luckyCounter, 0);
	}

	@Test
	public final void testShakeBallEightBall() {
		EightBall shaken2 = new EightBall();
		String response = null;
		response = EightBall.shakeBall(shaken2);
		assertNotNull("Response was not set when given parameter." , response);
		assertNotEquals("Luck was not set when given parameter." , shaken2.luckyCounter, 0);
	}

}
