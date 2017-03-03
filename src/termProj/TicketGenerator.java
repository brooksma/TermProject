package termProj;

import java.util.Random;

/**
 * Generates a randomized Lottery Ticket number.
 * Can generate a Pick 3, Lucky Shot, 6 Pair, or 7 Pair number.
 * @author Natasha Speck
 * @version 1.1, 2017/02/16
 */
public class TicketGenerator {
	/** A Random object to select numbers. */
	private Random generator;
	
	/**
	 * Constructor for a <code>TicketGenerator</code> object.
	 * Initializes a new <code>Random</code> object.
	 */
	public TicketGenerator() {
		generator = new Random();
	}
	
	/** Returns the Random object.
	 * @return The Random object.
	 */
	public Random getGenerator() {
		return generator;
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
		String three = "" + generator.nextInt(10) 
			+ generator.nextInt(10) 
			+ generator.nextInt(10);
		return three;
	}
	
	/**
	 * Generates a twelve-digit pseudorandom number.
	 * @return the twelve-digit number as a <code>String</code>
	 */
	public String sixPair() {
		TicketGenerator tckt = new TicketGenerator();
		String six = tckt.pickThree() + tckt.pickThree() 
			+ tckt.pickThree() + tckt.pickThree();
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
	public String generate(final int numDigits) 
			throws IllegalArgumentException {
		String fullNum = "";
		if (numDigits < 0 || numDigits >= 50) {
			throw new IllegalArgumentException(
					"Please enter a number greater"
					+ " than zero and less than 50.");
		} else {
			for (int it = 0; it < numDigits; it++) {
				fullNum += "" + generator.nextInt(10);
			}
		}
		return fullNum;
	}
	
	/**
	 * Generates a user-specified number of pairs of digits in a 
	 * pseudorandom number. <p> Throws an 
	 * <code>IllegalArgumentException</code> 
	 * if entry is less than zero.
	 * @param numPairs the user's desired number of pairs of digits as 
	 * an integer
	 * @return the user-specified number as a <code>String</code>
	 * @throws IllegalArgumentException if entry is less than zero
	 */
	public String generatePairs(final int numPairs)
			throws IllegalArgumentException {
		String fullNum = "";
		if (numPairs < 0 || numPairs >= 25) {
			throw new IllegalArgumentException(
					"Please enter a number greater"
					+ " than zero and less than 25.");
		} else {
			TicketGenerator tckt = new TicketGenerator();
			for (int it = 0; it < numPairs; it++) {
				fullNum += "" + tckt.luckyShot();
			}
		}
		return fullNum;
	}
}
