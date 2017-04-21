package termProj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**Testing suite for <code>Runes</code>.*/
public class RunesTest {

	/**Test constructor.*/
	@Test
	public final void testRunes() {
		Runes x = new Runes();
		Rune[] r = new Rune[25];
		r = x.getRuneArray();
		assertNotNull(r);
		assertEquals(r[0].getName(), "Mannaz");
		assertEquals(r[0].getKey(0), "i");
		assertEquals(r[0].getMessage(), 
				"Be true to yourself and open to counsel.");
	}
	
	/** Test array accessor.*/
	@Test
	public final void testGetRunes() {
		Runes x = new Runes();
		Rune[] r = new Rune[25];
		r = x.getRuneArray();
		assertNotNull(r);
		assertEquals(r[0].getName(), "Mannaz");
		assertEquals(r[0].getKey(0), "i");
		assertEquals(r[0].getMessage(), 
				"Be true to yourself and open to counsel.");
	}

	/**Test luck accessor.*/
	@Test
	public final void testGetLuck() {
		Runes x = new Runes();
		assertEquals(x.getLuck(), 0);
	}

	/**Test searching method.*/
	@Test
	public final void testSeekGuidance() {
		Runes x = new Runes();
		assertEquals(x.seekGuidance(null).getName(), "The Unknowable");
		assertEquals(x.seekGuidance("This query is too long and has "
				+ "too many words in it.").getMessage(),
				"Please make your query only up to ten"
				+ " words in length.");
	}

}
