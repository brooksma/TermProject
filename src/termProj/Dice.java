package termProj;

import java.util.Random;

/**
 * The code backbone for a six-sided die. <p>
 * @author NATASHA
 * @version 1.4 2017/02/26
 */
public class Dice {
	/** An int holding the die's face number. */
	private int die;
	/** A private object from the Random class to generate the die's
	 * face number. */
	private static Random number;
	/** A count of how often a user gets a lucky result. */
	public int luckyCounter;
	/**
	 * Constructor for a <code>Dice</code> object. <p>
	 * Initializes a <code>Random</code>, and sets
	 * <code>int die</code> to 1.
	 */
	public Dice() {
		number = new Random();
		die = 1;
	}
	
	/** Returns the die. 
	 * @return The die. */
	public int getDie() {
		return die;
	}
	
	/** Returns the luckyCounter. 
	 * @return The luckyCounter. */
	public int getLuck() {
		return luckyCounter;
	}

	/**
	 * Static version of rolling, if needed.<p>
	 * Sets an instance of <code>Dice</code>'s <code>die</code> field
	 * with a random <code>int</code> from 0 to 6, then recursively calls
	 * itself if it gets zero
	 * @param die0 : the instance of <code>Dice</code> to be set
	 * @return the <code>int</code> within the instance
	 */
	public static int roll(final Dice die0) {
		die0.die = number.nextInt(7);
		if (die0.die == 0) {
			Dice.roll(die0);
		}
		return die0.die;
	}
	
	/**
	 * Non-static version of rolling, if needed.<p>
	 * Sets an instance of <code>Dice</code>'s <code>die</code> field
	 * with a random <code>int</code> from 0 to 6, then recursively calls
	 * itself if it gets zero
	 * @return the <code>int</code> within the instance
	 */
	public int roll() {
		die = number.nextInt(7);
		if (die == 0) {
			this.roll();
		}
		return die;
	}
}
