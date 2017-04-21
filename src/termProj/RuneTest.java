package termProj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/** JUnit testing for <code>Rune</code>.*/
public class RuneTest {

	/** Test constructor. */
	@Test
	public final void testRune() {
		Rune x = new Rune();
		assertEquals(x.getName(), "");
		assertEquals(x.getMessage(), "");
		assertNotNull(x.getKeys());
	}

	/** Test constructor. */
	@Test
	public final void testRuneStringStringStringArrayBoolean() {
		String[] k = {"kiki", "melvin"};
		Rune x = new Rune("Steve", "Yo", k, false);
		assertEquals(x.getName(), "Steve");
		assertEquals(x.getMessage(), "Yo");
		assertNotNull(x.getKeys());
		assertEquals(x.getKeys().length, 2);
		assertFalse(x.getLuck());
	}

	/** Test constructor. */
	@Test
	public final void testRuneStringIntBoolean() {
		Rune x = new Rune("Kay", 2, true);
		assertEquals(x.getName(), "Kay");
		assertEquals(x.getKeys().length, 2);
		assertTrue(x.getLuck());
	}

	/** Test accessor method. */
	@Test
	public final void testGetName() {
		Rune x = new Rune("Steve", 2, true);
		assertEquals(x.getName(), "Steve");
	}

	/** Test accessor method. */
	@Test
	public final void testGetMessage() {
		Rune x = new Rune();
		x.setMessage("Sup");
		assertEquals(x.getMessage(), "Sup");
	}

	/**Test set method.*/
	@Test
	public final void testSetMessage() {
		Rune x = new Rune();
		x.setMessage("Sup");
		assertEquals(x.getMessage(), "Sup");
	}

	/** Test accessor method. */
	@SuppressWarnings("deprecation")
	@Test
	public final void testGetKeys() {
		Rune x = new Rune();
		String[] k = {"sup"};
		x.setKeys(k);
		assertEquals(x.getKeys(), k);
	}

	/**Test set method.*/
	@SuppressWarnings("deprecation")
	@Test
	public final void testSetKeys() {
		Rune x = new Rune();
		String[] k = {"sup"};
		x.setKeys(k);
		assertEquals(x.getKeys(), k);
	}

	/** Test accessor method. */
	@Test
	public final void testGetKey() {
		Rune x = new Rune();
		String[] k = {"sup", "yo"};
		x.setKeys(k);
		assertEquals(x.getKey(0), "sup");
		assertEquals(x.getKey(1), "yo");
	}

	/** Test accessor method. */
	@Test
	public final void testGetLuck() {
		Rune x = new Rune("Steve", 2, false);
		assertFalse(x.getLuck());
		Rune y = new Rune("Kay", 2, true);
		assertTrue(y.getLuck());
	}

	/** Test accessor method. */
	@Test
	public final void testGetScore() {
		Rune x = new Rune();
		assertEquals(x.getScore(), 0);
		x.score();
		assertEquals(x.getScore(), 1);
	}

	/**Test score increase.*/
	@Test
	public final void testScore() {
		Rune x = new Rune();
		assertEquals(x.getScore(), 0);
		x.score();
		assertEquals(x.getScore(), 1);
	}

	/** Test search for word in array. */
	@Test
	public final void testSeek() {
		Rune x = new Rune();
		assertFalse(x.seek("sup"));
		assertFalse(x.seek("yo"));
		assertFalse(x.seek("kk"));
		String[] k = {"sup", "yo", "kk"};
		x.setKeys(k);
		assertTrue(x.seek("sup"));
		assertTrue(x.seek("yo"));
		assertTrue(x.seek("kk"));
		assertFalse(x.seek("xd"));
		assertFalse(x.seek(""));
	}

}
