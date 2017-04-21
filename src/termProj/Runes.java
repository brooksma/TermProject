/**
 *
 */
package termProj;


/** A backbone code class for the Rune Generator.
 * @author Natasha Speck */
public class Runes {

	//Fields
	/**The first rune. */
	private final Rune mannaz = new Rune("Mannaz", 7, true);
	/** A set of keywords for mannaz. */
	private final String[] mkeys = {"i", "me", "myself", "self",
			"personal", "personally", "people"};

	/**The second rune. */
	private final Rune gebo = new Rune("Gebo", 11, true);
	/** A set of keywords for gebo. */
	private final String[] gkeys = {"boyfriend", "girlfriend",
			"partner", "coworker", "friend", "Christmas",
			"holiday", "gift", "present", "spouse", "birthday"};

	/**The third rune. */
	private final Rune anguz = new Rune("Anguz", 10, true);
	/** A set of keywords for anguz. */
	private final String[] akeys = {"say", "said", "crazy",
			"stupid", "wild", "divine", "feel", "holy",
			"inspired", "weird"};

	/**The fourth rune. */
	private final Rune dhagaz = new Rune("Dhagaz", 6, false);
	/** A set of keywords for dhagaz. */
	private final String[] dhkeys = {"stuff", "house", "home",
			"return", "run", "things"};

	/**The fifth rune. */
	private final Rune uruz = new Rune("Uruz", 6, false);
	/** A set of keywords for uruz. */
	private final String[] ukeys = {"weak", "problem",
			"worried", "anxious", "give", "more"};

	/**The sixth rune. */
	private final Rune perth = new Rune("Perth", 4, false);
	/** A set of keywords for perth. */
	private final String[] pkeys = {"new", "cheating", "know",
			"looking"};

	/**The seventh rune. */
	private final Rune nauthiz = new Rune("Nauthiz", 3, false);
	/** A set of keywords for nauthiz. */
	private final String[] nkeys = {"need", "want", "excited"};

	/**The eighth rune. */
	private final Rune ing = new Rune("Ing", 6, true);
	/** A set of keywords for ing. */
	private final String[] ikeys = {"rough", "kid",
			"child", "pregnant", "sex", "unprotected"};

	/**The ninth rune. */
	private final Rune eihwaz = new Rune("Eihwaz", 6, false);
	/** A set of keywords for eihwaz. */
	private final String[] eikeys = {"bored", "boring", "protect",
			"defend", "lonely", "attack"};

	/**The tenth rune. */
	private final Rune algiz = new Rune("Algiz", 6, false);
	/** A set of keywords for algiz. */
	private final String[] alkeys = {"safe", "unsafe", "scared",
			"afraid", "following", "unknown"};

	/**The eleventh rune. */
	private final Rune fehu = new Rune("Fehu", 7, true);
	/** A set of keywords for fehu. */
	private final String[] fkeys = {"friends", "own", "have",
			"desire", "money", "funds", "bank"};

	/**The twelfth rune. */
	private final Rune wunjo = new Rune("Wunjo", 6, true);
	/** A set of keywords for wunjo. */
	private final String[] wkeys = {"curious", "wonder",
			"sad", "depressed", "depression", "suicide"};

	/**The thirteenth rune. */
	private final Rune jera = new Rune("Jera", 9, true);
	/** A set of keywords for jera. */
	private final String[] jkeys = {"job", "tax",
			"government", "taxes", "jobs", "future", "year",
			"farm", "farming"};

	/**The fourteenth rune. */
	private final Rune kano = new Rune("Kano", 8, true);
	/** A set of keywords for kano. */
	private final String[] kkeys = {"stomach", "boat",
			"boating", "fishing", "dark", "closed", "open",
			"door"};

	/**The fifteenth rune. */
	private final Rune teiwaz = new Rune("Teiwaz", 7, true);
	/** A set of keywords for teiwaz. */
	private final String[] tkeys = {"lost", "losing", "sports",
			"fighting", "illness", "confused", "cancer"};

	/**The sixteenth rune. */
	private final Rune berkana = new Rune("Berkana", 6, false);
	/** A set of keywords for berkana. */
	private final String[] bkeys = {"pregnant", "motivation",
			"religion", "old", "new", "pain"};

	/**The seventeenth rune. */
	private final Rune ehwaz = new Rune("Ehwaz", 8, true);
	/** A set of keywords for ehwaz. */
	private final String[] ehkeys = {"move", "moving", "house",
			"pet", "horse", "day", "night", "dark"};

	/**The eighteenth rune. */
	private final Rune laguz = new Rune("Laguz", 6, true);
	/** A set of keywords for laguz. */
	private final String[] lkeys = {"cruise", "flow", "crying",
			"salty", "water", "unsure"};

	/**The nineteenth rune. */
	private final Rune haegl = new Rune("Haegl", 15, false);
	/** A set of keywords for haegl. */
	private final String[] hkeys = {"weather", "daily", "life",
			"uneasy", "snow", "hailed", "sleet", "tornado",
			"Trump"};

	/**The twentieth rune. */
	private final Rune raido = new Rune("Raido", 11, true);
	/** A set of keywords for raido. */
	private final String[] rkeys = {"go", "going", "vacation",
			"paranormal", "supernatural", "ghost", "poterlogist"};

	/**The twenty-first rune. */
	private final Rune thurisaz = new Rune("Thurisaz", 9, false);
	/** A set of keywords for thurisaz. */
	private final String[] thkeys = {"inconvenient", "hell", "pain",
			"annoying", "gate", "wall", "fence", "big", "huge"};

	/**The twenty-second rune. */
	private final Rune othila = new Rune("Othila", 11, true);
	/** A set of keywords for othila. */
	private final String[] okeys = {"day", "struggling", "dark",
			"thoughts", "work", "working", "tough", "hard",
			"project", "homework", "paper"};

	/**The twenty-third rune. */
	private final Rune isa = new Rune("Isa", 7, false);
	/** A set of keywords for isa. */
	private final String[] iskeys = {"ice", "icey", "standoff",
			"not", "argument", "arguing", "listening"};

	/**The twenty-fourth rune. */
	private final Rune sowelu = new Rune("Sowelu", 8, true);
	/** A set of keywords for sowelu. */
	private final String[] skeys = {"illness", "mental", "arm",
			"leg", "missing", "head", "hole", "heart"};

	/**The twenty-fifth rune. */
	private final Rune unknowable = new Rune("The Unknowable", 1, true);
	/** A set of keywords for the unknowable. */
	private final String[] unkeys = {"destiny"};

	/** A compiled array of all of the runes. */
	private final Rune[] runes = {mannaz, gebo, anguz, dhagaz, uruz,
			perth, nauthiz, ing, eihwaz, algiz, fehu, wunjo, jera,
			kano, teiwaz, berkana, ehwaz, laguz, haegl, raido,
			thurisaz, othila, isa, sowelu, unknowable};

	/** A luck counter for the overall project. */
	private int luckCounter = 0;

	//Methods
	/** Constructor. */
	public Runes() {
		mannaz.setMessage("Be true to yourself and open to counsel.");
		mannaz.setKeys(mkeys);
		gebo.setMessage("A union is at hand, be sure to maintain your"
				+ " own identity.");
		gebo.setKeys(gkeys);
		anguz.setMessage("Something is beginning be curious and open to"
				+ " signs.");
		anguz.setKeys(akeys);
		dhagaz.setMessage("Soon you will have to sacrifice for a gift."
				+ " Do not be bound to the past.");
		dhagaz.setKeys(dhkeys);
		uruz.setMessage("Self-change and opportunity will soon come"
				+ " from loss.");
		uruz.setKeys(ukeys);
		perth.setMessage("Beware of surprises. Focus on the moment, "
				+ "not the future outcomes.");
		perth.setKeys(pkeys);
		nauthiz.setMessage("Show restraint, and ask for forgiveness "
				+ "from those you have wronged.");
		nauthiz.setKeys(nkeys);
		ing.setMessage("Prioritize completion and set yourself free "
				+ "from burdens.");
		ing.setKeys(ikeys);
		eihwaz.setMessage("Be patient and persevere, these are trying"
				+ " times.");
		eihwaz.setKeys(eikeys);
		algiz.setMessage("New challenges will soon arise, keep yourself"
				+ " under control.");
		algiz.setKeys(alkeys);
		fehu.setMessage("Satisfaction and wealth are coming your way; "
				+ "do not take them lightly.");
		fehu.setKeys(fkeys);
		wunjo.setMessage("Joy and a break from pain are coming, be "
				+ "patient.");
		wunjo.setKeys(wkeys);
		jera.setMessage("Keep your spirits up, what you are trying to"
				+ " do will take time.");
		jera.setKeys(jkeys);
		kano.setMessage("Open up to others and to new ideas. Light will"
				+ " uncover the truth.");
		kano.setKeys(kkeys);
		teiwaz.setMessage("Be patient and kind, but dedicated. Stick to"
				+ " your guns.");
		teiwaz.setKeys(tkeys);
		berkana.setMessage("Go into the future with care, and put needs"
				+ " before wants.");
		berkana.setKeys(bkeys);
		ehwaz.setMessage("Change for the better is on the way.");
		ehwaz.setKeys(ehkeys);
		laguz.setMessage("Draw upon your gut instincts and"
				+ " inner feelings to lead yourself.");
		laguz.setKeys(lkeys);
		haegl.setMessage("Events beyond your control are"
				+ " happening, but you will grow from them.");
		haegl.setKeys(hkeys);
		raido.setMessage("Ask those above you for guidance,"
				+ " as you are on the path to self-healing.");
		raido.setKeys(rkeys);
		thurisaz.setMessage("Pause and reflect on your"
				+ " descisions before proceeding.");
		thurisaz.setKeys(thkeys);
		othila.setMessage("You will soon vanquish your demons."
				+ " Seize any opportunities which come"
				+ " your way.");
		othila.setKeys(okeys);
		isa.setMessage("Be patient, right now you are trapped."
				+ " Don't be stubborn and it will pass.");
		isa.setKeys(iskeys);
		sowelu.setMessage("Reveal your inner light to others,"
				+ " now is the time for self-expression.");
		sowelu.setKeys(skeys);
		unknowable.setMessage("Your destiny is rearing its head"
				+ " and your being is in question. Do not fear,"
				+ " you hold the reigns.");
		unknowable.setKeys(unkeys);
		}

	/** Accesses the luck counter.
	 * @return the luck counter. */
	public int getLuck() {
		return luckCounter;
	}

	/** Accesses the list of runes, for testing purposes.
	 * @return the list of <code>Rune</code> objects. */
	public Rune[] getRuneArray() {
		return runes;
	}

	/** Updates the luck counter according to the chosen rune.
	 * @param rune the selected rune to change the luck counter. */
	private void updateLuck(final Rune rune) {
		if (rune.getLuck()) {
			luckCounter++;
		} else {
			luckCounter--;
		}
	}

	/** The backbone of a String search and connection method.
	 *  It goes through a query <code>String</code> to connect
	 *  the query's key words to the <code>Rune</code> keywords
	 *  to determine the reply.
	 * @param query the given question to search through
	 * @return The rune to respond to the query with.
	 */
	public Rune seekGuidance(final String query) {
		Rune highest = new Rune();
		highest = unknowable;
		if (query != null) {
			String query1 = query.toLowerCase();
			String[] queryWords = query1.split("[\\s?.!,]");
			if (queryWords.length <= 10) {
				for (int iterator = 0; iterator
					< queryWords.length;
					iterator++) {
					for (int iterator1 = 0;
						iterator1
						< runes.length - 1;
						iterator1++) {
						if (runes[iterator1].seek(
							queryWords[
							  iterator])) {
							runes[iterator1].
							score();
							if (runes[iterator1].
							getScore()
							> highest.
							getScore()) {
							highest = runes[
							    iterator1];
							}
						}
					}
				}
			} else if (queryWords.length <= 10) {
			highest.setMessage("Please make your query only"
				+ " up to ten words in length.");
			}
			this.updateLuck(highest);
		}
		return highest;
	}
}
