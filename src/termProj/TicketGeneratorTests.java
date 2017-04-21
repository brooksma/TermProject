package termProj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/** A testing suite for the GUI and backbone of the TicketGenerator module. */
public class TicketGeneratorTests {

	/** Tests the backbone constructor. */
	@Test
	public final void testTicketGenerator() {
		TicketGenerator test = new TicketGenerator();
		assertNotNull("Ticket not initialized.", test.getGenerator());
	}

	/** Tests the <code>luckyShot()</code> backbone method. */
	@Test
	public final void testLuckyShot() {
		TicketGenerator test = new TicketGenerator();
		String testor = test.luckyShot();
		System.out.println("LuckyShot: " + testor);
		assertNotNull("LuckyShot did not work.", testor);
		assertEquals("LuckyShot set the wrong # of digits.",
				testor.length(), 2);
	}

	/** Tests the <code>pickThree()</code> backbone method. */
	@Test
	public final void testPickThree() {
		TicketGenerator test = new TicketGenerator();
		String testor = test.pickThree();
		System.out.println("PickThree: " + testor);
		assertNotNull("PickThree did not work.", testor);
		assertEquals("PickThree set the wrong # of digits.",
				testor.length(), 3);
	}

	/** Tests the <code>sixPair()</code> backbone method. */
	@Test
	public final void testSixPair() {
		TicketGenerator test = new TicketGenerator();
		String testor = test.sixPair();
		System.out.println("SixPair: " + testor);
		assertNotNull("SixPair did not work.", testor);
		assertEquals("SixPair set the wrong # of digits.",
				12, testor.length());
	}

	/** Tests the <code>sevenPair()</code> backbone method. */
	@Test
	public final void testSevenPair() {
		TicketGenerator test = new TicketGenerator();
		String testor = test.sevenPair();
		System.out.println("SevenPair: " + testor);
		assertNotNull("SevenPair did not work.", testor);
		assertEquals("SevenPair set the wrong # of digits.",
				testor.length(), 14);
	}

	/** Tests the <code>generate()</code> backbone method. */
	@Test
	public final void testGenerate() {
		TicketGenerator test = new TicketGenerator();
		assertNotNull("Exception thrown incorrectly.",
				test.generate(5));
		String testor = test.generate(7);
		System.out.println("Generate: " + testor);
		assertEquals("Generated size incorrectly.",
				testor.length(), 7);
	}

	/** Tests the <code>generatePairs()</code> backbone method. */
	@Test
	public final void testGeneratePairs() {
		TicketGenerator test = new TicketGenerator();
		assertNotNull("Exception thrown incorrectly.",
				test.generatePairs(5));
		String testor = test.generatePairs(7);
		System.out.println("GeneratePairs: " + testor);
		assertEquals("Generated size incorrectly.",
				testor.length(), 14);
	}

	/** Tests the TicketGenerator module's GUI. */
	@Test
	public final void testPerformed() {
		TicketGeneratorGUI perform = new TicketGeneratorGUI();
		perform.twoButton.doClick();
		assertNotNull("Text field was not set.", perform.output);

		perform.threeButton.doClick();
		assertNotNull("Text field was not set.", perform.output);

		perform.sixButton.doClick();
		assertNotNull("Text field was not set.", perform.output);

		perform.sevenButton.doClick();
		assertNotNull("Text field was not set.", perform.output);
	}

}
