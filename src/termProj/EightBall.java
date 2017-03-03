package termProj;

import java.util.Random;

/**
 * This is a class which defines the code backbone for a Magic Eight Ball.
 * It allows for the creation of an <code>EightBall</code> object
 * and a pseudorandomly chosen response to a yes / no question.
 * @author Natasha Speck
 * @version 1.4, 2017/02/26
 */
public class EightBall {
	
	/** A public EightBall object. */
	private EightBall ball;
	/** An array of possible String responses to queries. */
	private final String[] responses = {"Yes.", "No.", "Maybe",
			"It is uncertain, try again.", "It is likely",
			"It is unlikely."};
	/** A Random object to select a response. */
	private Random randomNumber;
	/** A counter to hold how lucky a user is based on responses. */
	private int luckyCounter;
	
	//Methods
	
	/**
	 * Constructor for an <code>EightBall</code> object. <p>
	 * Initializes a new ball, a <code>Random</code> object, and a luck
	 * counter to be used in calculations.
	 */
	public EightBall() {
		this.ball = null;
		this.randomNumber = new Random();
		this.luckyCounter = 0;
	}
	
	/** Returns an EightBall object.
	 * @return An EightBall object. */
	public EightBall getBall() {
		return ball;
	}
	
	/** Returns the luck counter.
	 * @return The luck counter. */
	public int getLuck() {
		return luckyCounter;
	}
	
	/**
	 * Calculates which response to return with a psuedorandom from the
	 * <code>Random</code> class. Returns this calculated response to a
	 * question, and increases or decreases the luck counter based upon
	 * it. <p> Positive responses increment the luck counter by 1,
	 * negative responses decrease the luck counter by 1.
	 * @return response the <code>EightBall</code>'s <code>String
	 * </code> response to a query.
	 */
	public String shakeBall() {	
		String response = responses[randomNumber.nextInt(6)];
			
		if (response.equals(responses[0]) || response.equals(responses[2])
				|| response.equals(responses[4])) {
			luckyCounter += 1;
		} else if (response.equals(responses[1]) || response.equals(responses[3])
				|| response.equals(responses[5])) {
			luckyCounter -= 1;
		}
			
		return response;
	}
	
	/**
	 * Shakes a specified <code>EightBall</code> object using
	 * <code>shakeBall()</code>.
	 * @see this.shakeBall()
	 * @param toShake a specified<code>EightBall</code> object
	 * @return response the <code>EightBall</code>'s
	 * <code>String</code> response to a query
	 */
	public static String shakeBall(final EightBall toShake) {
		String response = toShake.shakeBall();
		return response;
	}
}
