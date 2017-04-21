package termProj;

import java.util.Random;

/**
 * A class for the Fortune Cookie task. It creates a FortCookie object,
 * and randomly chooses a phrase for the user. If it is one of the given
 * "lucky" phrases the luckyCounter is incremented.
 * @author Bridget Bieniek
 * @version 1.1, 2017/02/20
 **/

public class FortCookie {
	/** A FortCookie object. */
	private FortCookie fortune;
	/** An array of possible results which will increment
	 *  the luckyCounter. */
	private final String[] lucky = {"A dream you have will come true.", 
			"The one you desire feels the same.", 
			"Wealth awaits you very soon.",
			"Now is the time to try something new.", 
			"You will live long and enjoy life." };
	/** An array of possible results which will decrement the 
	 * luckyCounter. */
	private final String[] unlucky = {"Today is a disastrous day.", 
			"It's over your head. Time for help.", 
			"Your life's forecast is cloudy.",
			"You are being stretched too thin.", 
			"Stormy seas ahead in relationships." };
	/** A Random object to select a result. */
	private Random randomNumber;
	/** A count of how often a user gets a lucky result. */
	private int luckyCounter;
	
	/** Constructs a FortCookie object with a null fortune, a Random,
	 *  and a 0 luckyCounter. */
	public FortCookie() {
		this.fortune = null;
		this.randomNumber = new Random();
		this.luckyCounter = 0;
	}
	
	/** Returns the FortCookie object.
	 * @return The FortCookie object.*/
	public FortCookie getFortune() {
		return fortune;
	}
	
	/** Returns the luck counter.
	 * @return The luck counter int. */
	public int getLuck() {
		return luckyCounter;
	}

	/**
	 *Method that gives a random phrase based on a random number.
	 *Depending on phrase, luckyCounter is incremented or decremented.
	 *@return a randomly selected result from the lucky or unlucky lists
	 **/
	public String breakCookie() {	
		int luck = randomNumber.nextInt(2);
		String phrase;
		
		if (luck == 0) {
			phrase = lucky[randomNumber.nextInt(4)];
			luckyCounter += 1;
		} else {
			phrase = unlucky[randomNumber.nextInt(4)];
			luckyCounter -= 1;
		}
		return phrase;
	}
	
	/**
	 * Breaks a given FortCookie using the breakCookie() method.
	 * @param broke The FortCookie to be broken.
	 * @return the phrase given after breaking the cookie.
	 **/
	public static String breakCookie(final FortCookie broke) {
		String phrase = broke.breakCookie();
		return phrase;
	}
}
