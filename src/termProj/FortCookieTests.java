package termProj;

import static org.junit.Assert.*;
import org.junit.Test;

public class FortCookieTests {
	
	@Test
	public final void testFortCookie() {
		FortCookie constructor = new FortCookie();
		assertNull("Constructor error", constructor.fortune);
		assertEquals("Counter error", constructor.luckyCounter, 0);
	}

	@Test
	public final void testBreakCookie() {
		FortCookie broke = new FortCookie();
		String phrase = null;
		phrase = broke.breakCookie();
		assertNotNull("Phrase was not set." , phrase);
		assertNotEquals("Counter was not changed." , broke.luckyCounter, 0);
	}

	@Test
	public final void testBreakCookie2() {
		FortCookie broke2 = new FortCookie();
		String phrase2 = null;
		phrase2 = FortCookie.breakCookie(broke2);
		assertNotNull("Phrase was not returned" , phrase2);
		assertNotEquals("Counter was not changed." , broke2.luckyCounter, 0);
	}

}