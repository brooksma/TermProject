/**
 * 
 */
package termProj;

import java.util.Random;

/**
 * The code backbone for a six-sided die. <p>
 * <b>Fields</b><p>
 * <code>die</code>: an <code>int</code> for the number rolled on the die<p>
 * <code>number</code>: an instance of Java's <code>Random</code> Class<p>
 * <b>Methods</b><p>
 * <code>Dice()</code>: constructor <p>
 * <code>roll(Dice die0)</code>: sets an instance of <code>Dice</code>'s <code>die</code> field
 * with a random <code>int</code> from 0 to 6, then rerolls if it gets zero
 * @author NATASHA
 * @version 1.4 2017/02/26
 */
public class Dice {
	public int die;
	private static Random number;
	
	/**
	 * Constructor for a <code>Dice</code> object. <p>
	 * Initializes a <code>Random</code>, and sets <code>int die</code> to 1.
	 */
	public Dice() {
		number = new Random();
		die = 1;
	}

	/**
	 * Static version of rolling, if needed.<p>
	 * Sets an instance of <code>Dice</code>'s <code>die</code> field
	 * with a random <code>int</code> from 0 to 6, then recursively calls itself if it gets zero
	 * @param die0 : the instance of <code>Dice</code> to be set
	 * @return the <code>int</code> within the instance
	 */
	public static int roll(Dice die0) {
		die0.die = number.nextInt(7);
		if(die0.die == 0)
			Dice.roll(die0);
		return die0.die;
	}
	
	/**
	 * Non-static version of rolling, if needed.<p>
	 * Sets an instance of <code>Dice</code>'s <code>die</code> field
	 * with a random <code>int</code> from 0 to 6, then recursively calls itself if it gets zero
	 * @return the <code>int</code> within the instance
	 */
	public int roll() {
		die = number.nextInt(7);
		if(die == 0)
			this.roll();
		return die;
	}
}