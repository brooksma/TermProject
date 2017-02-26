package termProj;

import java.util.Random;

/**
 * This is a class which defines the code backbone for a Magic Eight Ball. It allows
 * for the creation of an <code>EightBall</code> object, the resetting of said object
 * and its public parts, and a pseudorandomly chosen response to a yes / no question. <p>
 * <b>Fields: </b> <p>
 * ball: public, an <code>EightBall</code> object <p>
 * responses: private final, an array of <code>Strings</code> denoting possible responses the
 * <code>EightBall</code> can give <p>
 * randomNumber: private, a <code>Random</code> object <p>
 * luckyCounter: public, an <code>int</code> holding how much luck the user has encountered
 * <p><b>Methods:</b> <p>
 * <code>EightBall()</code>: constructor <p>
 * <code>shakeBall()</code>: sets the ball's response and updates the <code>luckyCounter</code>
 * @author Natasha Speck
 * @version 1.4, 2017/02/26
 */
public class EightBall {
	
	//Fields
	public EightBall ball;
	private final String[] responses = { "Yes." , "No." , "Maybe" , "It is uncertain, try again." ,
			"It is likely" , "It is unlikely." };
	private Random randomNumber;
	public int luckyCounter;
	
	//Methods
	
	/**
	 * Constructor for an <code>EightBall</code> object.
	 * <p>
	 * Initializes a new ball, a <code>Random</code> object, and a luck counter to
	 * be used in calculations.
	 */
	public EightBall() {
		this.ball = null;
		this.randomNumber = new Random();
		this.luckyCounter = 0;
	}
	
	/**
	 * Calculates which response to return with a psuedorandom from the
	 * <code>Random</code> class. Returns this calculated response to a question,
	 * and increases or decreases the luck counter based upon it.
	 * <p>
	 * Positive responses increment the luck counter by 1, negative responses
	 * decrease the luck counter by 1.
	 * @return <code>response</code>: the <code>EightBall</code>'s <code>String</code> response to a query
	 */
	public String shakeBall() {	
		String response = responses[randomNumber.nextInt(6)];
		
		if(response == responses[0] || response == responses[4])
			luckyCounter += 1;
		else if(response == responses[1] || response == responses[5])
			luckyCounter -= 1;
		
		return response;
	}
	
	/**
	 * Shakes a specified <code>EightBall</code> object using <code>shakeBall()</code>.
	 * @see this.shakeBall()
	 * @param <code>toShake</code>: a specified <code>EightBall</code> object
	 * @return <code>response</code>: the <code>EightBall</code>'s <code>String</code> response to a query
	 */
	public static String shakeBall(EightBall toShake) {
		String response = toShake.shakeBall();
		return response;
	}
}
