package termProj;

/** A class which holds a <code>Rune Object</code>. <p>
 * Rune meanings and names courtesy of: <p>
 * The Book of Runes, Ralph Blum, St. Martin's Press,
 *  New York, 1982.
 * @author Natasha Speck */
public class Rune {

	//Fields
	/** The name of the rune.*/
	private String name = "";
	/** The rune's advice.*/
	private String meaning = "";
	/** The keywords which trigger the rune.*/
	private String[] keywords;
	/** Whether or not the rune is lucky.*/
	private boolean lucky = false;
	/** The likelihood of the Rune being the
	 *  final output. */
	private int outputScore = 0;


	//Methods
	/** Declarative constructor with no parameters.
	 * Used for creating placeholder <code>Runes</code>. */
	public Rune() {
		name = "";
		meaning = "";
		keywords = new String[5];
	}

	/** Declarative constructor with all parameters.
	 * @param rune the name of the rune
	 * @param future the meaning of the rune
	 * @param keys the keywords which trigger the rune
	 * @param luck whether or not the rune is lucky  */
	public Rune(final String rune,
			final String future, final String[] keys,
			final boolean luck) {
		name = rune;
		meaning = future;
		keywords = keys;
		lucky = luck;
	}

	/** Declarative constructor with minimal parameters.
	 * @param rune the name of the rune
	 * @param listSize the size of the array of keywords
	 * @param luck whether or not the rune is lucky  */
	public Rune(final String rune, final int listSize, final boolean luck) {
		name = rune;
		keywords = new String[listSize];
		lucky = luck;
	}

	/** Gets the name of the rune.
	 * @return The rune's <code>name</code> field. */
	public String getName() {
		return name;
	}

	/** Gets the rune's advice.
	 * @return The rune's <code>meaning</code> field.  */
	public String getMessage() {
		return meaning;
	}

	/** Sets the rune's advice.
	 * @param mssg The new meaning of the rune. */
	public void setMessage(final String mssg) {
		meaning = mssg;
	}

	/** Gets the rune's keywords.
	 * @return The rune's <code>keyword</code> field.  */
	public String[] getKeys() {
		return keywords;
	}

	/** Sets the rune's keywords to a new array.
	 * @param newKeys The new array. */
	public void setKeys(final String[] newKeys) {
		keywords = newKeys;
	}

	/** Gets a single keyword at the specified index.
	 * @param index the specified index
	 * @return One keyword from the <code>keywords</code> field. */
	public String getKey(final int index) {
		if (index >= 0) {
			return keywords[index];
		} else {
			return keywords[0];
			}
	}

	/** Tells whether or not the rune is lucky.
	 * @return The rune's <code>lucky</code> field. */
	public boolean getLuck() {
		return lucky;
	}

	/** Tells the likelihood of the Rune being selected.
	 * @return The likelihood of the Rune being selected.
	 */
	public int getScore() {
		return outputScore;
	}

	/** Increases the outputScore.*/
	public void score() {
		this.outputScore++;
	}

	/** The hidden search method which cycles
	 * through a rune's keys to find a match.
	 * @param word is the <code>String</code> which is
	 * being sought in the Rune's keywords
	 * @return True if the word is in the Rune's keywords.
	 * Otherwise false.
	 */
	public boolean seek(final String word) {
		boolean inKeys = false;
		try {
			for (int i = 0; i < keywords.length;
					i++) {
				if (word.equals(getKey(i))) {
					inKeys = true;
				}
			}
		} catch (Exception e) {
			setMessage("Please make your query only"
					+ " up to ten words in length.");
		}
		return inKeys;
	}
}
