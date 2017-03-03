
package termProj;

import java.util.Random;

/**
 * Generates a randomised Lottery Ticket number.
 * Can generate a Pick 3, Lucky Shot, 6 Pair, or 7 Pair number. <p>
 * <b>Fields:</b> <p>
 * <code>generator</code>: a <code>Random</code> object <p>
 * <b>Methods:</b> <p>
 * <code>TicketGenerator()</code>: a constructor for a <code>TicketGenerator</code> object
 * <p><code>luckyShot()</code>: generates a two-digit number
 * <p><code>pickThree()</code>: generates a three-digit number
 * <p><code>sixPair()</code>: generates a 6-digit number
 * <p><code>sevenPair()</code>: generates a 7-digit number
 * <p><code>generate(int)</code>: generates a user-specified number of digits
 * <p><code>generatePairs(int)</code>: generates a user-specified number of pairs of digits
 * @author Natasha Speck
 * @version 1.1, 2017/02/16
 */
public class TicketGenerator {
	//Fields
	protected Random generator;
	
	//Methods
	/**
	 * Constructor for a <code>TicketGenerator</code> object.
	 * Initializes a new <code>Random</code> object.
	 */
	public TicketGenerator() {
		generator = new Random();
	}
	
	/**
	 * Generates a two-digit pseudorandom number.
	 * @return the two-digit number as a <code>String</code>
	 */
	public String luckyShot() {
		String two = "" + generator.nextInt(10) + generator.nextInt(10);
		return two;
	}
	
	/**
	 * Generates a three-digit pseudorandom number.
	 * @return the three-digit number as a <code>String</code>
	 */
	public String pickThree() {
		String three = "" + generator.nextInt(10) + generator.nextInt(10) + generator.nextInt(10);
		return three;
	}
	
	/**
	 * Generates a twelve-digit pseudorandom number.
	 * @return the twelve-digit number as a <code>String</code>
	 */
	public String sixPair() {
		TicketGenerator tckt = new TicketGenerator();
		String six = tckt.pickThree() + tckt.pickThree() + tckt.pickThree() + tckt.pickThree();
		return six;
	}
	
	/**
	 * Generates a fourteen-digit pseudorandom number.
	 * @return the fourteen-digit number as a <code>String</code>
	 */
	public String sevenPair() {
		TicketGenerator tckt = new TicketGenerator();
		String seven = "";
		String firstSix = tckt.sixPair();
		String lastTwo = tckt.luckyShot();
		seven = firstSix + lastTwo;
		return seven;
	}
	
	/**
	 * Generates a user-specified number of digits in a pseudorandom number.
	 * @param numDigits the user's desired number of digits as an integer
	 * @return the user-specified number as a <code>String</code>
	 * @throws IllegalArgumentException if entry is less than zero
	 */
	public String generate(int numDigits) throws IllegalArgumentException {
		String fullNum = "";
		if(numDigits < 0 || numDigits >= 50)
			throw new IllegalArgumentException("Please enter a number greater than zero and less than 50.");
		else {
			for(int iterator = 0; iterator < numDigits; iterator++)
				fullNum += fullNum + generator.nextInt(10);
		}
		return fullNum;
	}
	
	/**
	 * Generates a user-specified number of pairs of digits in a pseudorandom number.
	 *<p> Throws an <code>IllegalArgumentException</code> if entry is less than zero.
	 * @param numPairs the user's desired number of pairs of digits as an integer
	 * @return the user-specified number as a <code>String</code>
	 * @throws IllegalArgumentException if entry is less than zero
	 */
	public String generatePairs(int numPairs) throws IllegalArgumentException {
		String fullNum = "";
		if(numPairs < 0 || numPairs >= 25)
			throw new IllegalArgumentException("Please enter a number greater than zero and less than 25.");
		else {
			TicketGenerator tckt = new TicketGenerator();
			for(int iterator = 0; iterator < numPairs; iterator++)
				fullNum += fullNum + tckt.luckyShot();
		}
		return fullNum;
	}
	

}
