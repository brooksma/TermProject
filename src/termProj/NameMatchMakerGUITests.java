package termProj;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * A basic testing for the Name Match Maker GUI.
 */

public class NameMatchMakerGUITests {
	/** Tests the MatchMakerGUI.*/
	@Test
	public final void testPerformed() {
		NameMatchMakerGUI perform = new NameMatchMakerGUI();
		perform.matchButton.doClick();
		
		assertNotNull("Text field was not set.", perform.output1);
	}
}
