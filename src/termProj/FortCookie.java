package termProj;

import java.util.Random;

/**
 * A class for the Fortune Cookie task. It creates a FortCookie object,
 * and randomly chooses a phrase for the user. If it is one of the given
 * "lucky" phrases the luckyCounter is incremented.
 * @author Bridget
 * @version 1.1, 2017/02/20
 **/

public class FortCookie {
	public FortCookie fortune;
	private final String[] lucky = { "A dream you have will come true.", "The person you desire feels the same about you." , 
			"Wealth awaits you very soon." , "Now is the time to try something new." , "You will live long and enjoy life." };
	private final String[] unlucky = { "Today is a disastrous day." , "It's over your head now. Time to get some help." , 
			"Your life's forecast is cloudy." , "You are being stretched too thin.", "Prepare for stormy seas in your relatioinship." };
	private Random randomNumber;
	public int luckyCounter;
	
	//constructor to initialize everything to zero
	public FortCookie() {
		this.fortune = null;
		this.randomNumber = new Random();
		this.luckyCounter = 0;
	}
	
	/**
	 *Method that gives a random phrase based on a random number.
	 *Depending on phrase, luckyCounter is incremented or decremented.
	 **/
	public String breakCookie() {	
		int luck = randomNumber.nextInt(1);
		String phrase;
		
		if(luck == 0){
			phrase = lucky[randomNumber.nextInt(4)];
			luckyCounter += 1;
		}
		else{
			phrase = unlucky[randomNumber.nextInt(4)];
			luckyCounter -= 1;
		}
		return phrase;
	}
	
	/**
	 * Breaks a given FortCookie using the breakCookie() method
	 * Returns the phrase given after breaking the cookie
	 **/
	public static String breakCookie(FortCookie broke) {
		String phrase = broke.breakCookie();
		return phrase;
	}
	
	//main method
	public static void main(String[] args) {
		FortCookie fort = new FortCookie();
		System.out.print(breakCookie(fort));
    	}
}
