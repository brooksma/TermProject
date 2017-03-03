package termProj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/** A testing suite for the GUI and backbone of a FortCookie. */
public class FortCookieTests {
	
	/** Tests the constructor for the backbone of a FortCookie. */
	@Test
	public final void testFortCookie() {
		FortCookie constructor = new FortCookie();
		assertNull("Constructor error", constructor.getFortune());
		assertEquals("Counter error", constructor.getLuck(), 0);
	}

	/** Tests the non-static <code>breakCookie()</code> method.*/
	@Test
	public final void testBreakCookie() {
		FortCookie broke = new FortCookie();
		String phrase = null;
		phrase = broke.breakCookie();
		assertNotNull("Phrase was not set.", phrase);
		assertNotEquals("Counter was not changed.", broke.getLuck(), 0);
	}

	/** Tests the static <code>breakCookie()</code> method.*/
	@Test
	public final void testBreakCookie2() {
		FortCookie broke2 = new FortCookie();
		String phrase2 = null;
		phrase2 = FortCookie.breakCookie(broke2);
		assertNotNull("Phrase was not returned", phrase2);
		assertNotEquals("Counter was not changed.", broke2.getLuck(),
				0);
	}
	
	/** Tests the FortCookieGUI.*/
	@Test
	public final void testPerformed() {
		FortCookieGUI perform = new FortCookieGUI();
		perform.breakButton.doClick();
		assertNotNull("Text field was not set.", perform.output);
	}
}
