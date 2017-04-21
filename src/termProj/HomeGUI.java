package termProj;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/** The Home page where the user can access all other modules.
 * @author Madison Brooks, Natasha Speck, Bridget Bieniek
 */
public class HomeGUI  extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	/**The Home GUI JFrame. */
	JFrame homeFrame = new JFrame("Test Your Luck");
	/** The Home GUI JPanel. */
	JPanel homePanel = new JPanel(new GridLayout(3, 5));
	
	/** The JButton for the color dialog. */
	JButton color = new JButton("Background Color");
	/** The JButton for luck counter. */
	JButton luck = new JButton("Luck Score");
	/** The JButton for the fortune cookie module. */
	JButton fortune = new JButton("Fortune Cookie");
	/** The JButton for the Magic 8-Ball module. */
	JButton ball = new JButton("Magic 8-Ball");
	/** The JButton for the Lottery Ticket module. */
	JButton numbers = new JButton("Lotto Ticket Number Generator");
	/** The JButton for the Dice module. */
	JButton dice = new JButton("Roll the Dice");
	/** The JButton for the NameMatchMaker module. */
	JButton name = new JButton("Name Match Maker");
	/** The JButton for the Runes module. */
	JButton rune = new JButton("Read Your Runes");
	
	/** A welcome label. */
	Label output = new Label("Welcome! Please select an option.");
	
	/** A set of dialog options for the color dialog. */
	Object[] options = {"Red", "Green", "Blue"};
	/** A String to hold the chosen color. */
	String colour;
	
	/** An EightBallGUI object for the Magic 8-Ball module. */
	EightBallGUI newBall;
	/** A FortCookieGUI object for the Fortune Cookie module. */
	FortCookieGUI newCookie;
	/** A TicketGeneratorGUI object for the Lottery Ticket module. */
	TicketGeneratorGUI newLotto;
	/** A DiceGUI object for the Dice module. */
	DiceGUI newDice;
	/** A NameMatchMakerGUI object for the Matchmaker module. */
	NameMatchMakerGUI newName;
	/** A RunesGUI object for the Runes module. */
	RunesGUI newRune;
	
	/**counter for luck history */
	private int luckyCount = 0;
	
	/** Returns the luck counter.
	 * @return The luck counter int. */
	public int getLuck() {
		return luckyCount;
	}
	
	/**
	 * Sets up a Graphics User Interface for the basic Ticket Generator
	 * module. <p> Uses the <code>GridBagLayout</code> form from the Java
	 * API.
	 */
	public HomeGUI() {
	    
		/* Welcome Message to the user*/
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 3;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.PAGE_START;
		homePanel.add(output, constraints);
		
		//Personalization
		GridBagConstraints constraints0 = new GridBagConstraints();
		constraints0.gridx = 3;
		constraints0.gridy = 1;
		constraints0.fill = GridBagConstraints.HORIZONTAL;
		homePanel.add(color, constraints0);
		color.addActionListener(this);

		//Luck
		GridBagConstraints constraints02 = new GridBagConstraints();
		constraints02.gridx = 3;
		constraints02.gridy = 2;
		constraints02.fill = GridBagConstraints.HORIZONTAL;
		homePanel.add(luck, constraints02);
		luck.addActionListener(this);
		
		/* Dice Button */
		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.gridx = 0;
		constraints1.gridy = 2;
		homePanel.add(dice, constraints1);
		dice.addActionListener(this);
		
		/* 8 Ball Button */
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.gridx = 1;
		constraints2.gridy = 2;
		homePanel.add(ball, constraints2);
		ball.addActionListener(this);
		
		/* Ticket Generator*/
		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.gridx = 3;
		constraints3.gridy = 2;
		homePanel.add(numbers, constraints3);
		numbers.addActionListener(this);
		
		/* Fortune Cookie */
		GridBagConstraints constraints4 = new GridBagConstraints();
		constraints4.gridx = 4;
		constraints4.gridy = 2;
		homePanel.add(fortune, constraints4);
		fortune.addActionListener(this);
		
		/* Name Match Maker */
		GridBagConstraints constraints5 = new GridBagConstraints();
		constraints5.gridx = 4;
		constraints5.gridy = 3;
		homePanel.add(name, constraints5);
		name.addActionListener(this);
		
		/* Runes */
		GridBagConstraints constraints6 = new GridBagConstraints();
		constraints5.gridx = 4;
		constraints5.gridy = 4;
		homePanel.add(rune, constraints6);
		rune.addActionListener(this);
		
		homeFrame.add(homePanel);
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.pack();
        homeFrame.setBounds(50, 50, 1000, 200);
        homeFrame.setVisible(true);
	}
	
	@Override
	public final void actionPerformed(final ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed == color) {
			colour = (String) JOptionPane.showInputDialog(homeFrame,
					"Select a color", "Background Color", 
					JOptionPane.QUESTION_MESSAGE, null,
					options, options[2]);
			if (colour.equals(options[0])) {
				homePanel.setBackground(new Color(125, 0, 0));
				color.setBackground(new Color(125, 0, 0));
				color.setForeground(Color.WHITE);
				color.setOpaque(true);
				luck.setBackground(new Color(125, 0, 0));
				luck.setForeground(Color.WHITE);
				luck.setOpaque(true);
				ball.setBackground(new Color(125, 0, 0));
				ball.setForeground(Color.WHITE);
				ball.setOpaque(true);
				dice.setBackground(new Color(125, 0, 0));
				dice.setForeground(Color.WHITE);
				dice.setOpaque(true);
				fortune.setBackground(new Color(125, 0, 0));
				fortune.setForeground(Color.WHITE);
				fortune.setOpaque(true);
				numbers.setBackground(new Color(125, 0, 0));
				numbers.setForeground(Color.WHITE);
				numbers.setOpaque(true);
				name.setBackground(new Color(125, 0, 0));
				name.setForeground(Color.WHITE);
				name.setOpaque(true);
				rune.setBackground(new Color(125, 0, 0));
				rune.setForeground(Color.WHITE);
				rune.setOpaque(true);
				output.setBackground(new Color(125, 0, 0));
				output.setForeground(Color.WHITE);
			} else if (colour.equals(options[1])) {
				homePanel.setBackground(new Color(0, 125, 0));
				color.setBackground(new Color(0, 125, 0));
				color.setForeground(Color.WHITE);
				color.setOpaque(true);
				luck.setBackground(new Color(0, 125, 0));
				luck.setForeground(Color.WHITE);
				luck.setOpaque(true);
				ball.setBackground(new Color(0, 125, 0));
				ball.setForeground(Color.WHITE);
				ball.setOpaque(true);
				dice.setBackground(new Color(0, 125, 0));
				dice.setForeground(Color.WHITE);
				dice.setOpaque(true);
				fortune.setBackground(new Color(0, 125, 0));
				fortune.setForeground(Color.WHITE);
				fortune.setOpaque(true);
				numbers.setBackground(new Color(0, 125, 0));
				numbers.setForeground(Color.WHITE);
				numbers.setOpaque(true);
				name.setBackground(new Color(0, 125, 0));
				name.setForeground(Color.WHITE);
				name.setOpaque(true);
				rune.setBackground(new Color(0, 125, 0));
				rune.setForeground(Color.WHITE);
				rune.setOpaque(true);
				output.setBackground(new Color(0, 125, 0));
				output.setForeground(Color.WHITE);
			} else if (colour.equals(options[2])) {
				homePanel.setBackground(new Color(0, 0, 125));
				color.setBackground(new Color(0, 0, 125));
				color.setForeground(Color.WHITE);
				color.setOpaque(true);
				luck.setBackground(new Color(0, 0, 125));
				luck.setForeground(Color.WHITE);
				luck.setOpaque(true);
				ball.setBackground(new Color(0, 0, 125));
				ball.setForeground(Color.WHITE);
				ball.setOpaque(true);
				dice.setBackground(new Color(0, 0, 125));
				dice.setForeground(Color.WHITE);
				dice.setOpaque(true);
				fortune.setBackground(new Color(0, 0, 125));
				fortune.setForeground(Color.WHITE);
				fortune.setOpaque(true);
				numbers.setBackground(new Color(0, 0, 125));
				numbers.setForeground(Color.WHITE);
				numbers.setOpaque(true);
				name.setBackground(new Color(0, 0, 125));
				name.setForeground(Color.WHITE);
				name.setOpaque(true);
				rune.setBackground(new Color(0, 0, 125));
				rune.setForeground(Color.WHITE);
				rune.setOpaque(true);
				output.setBackground(new Color(0, 0, 125));
				output.setForeground(Color.WHITE);
			}
		} else if (buttonPressed == ball) {
			newBall = new EightBallGUI();		
		} else if (buttonPressed == dice) {
			newDice = new DiceGUI();
		} else if (buttonPressed == fortune) {
			newCookie = new FortCookieGUI();
		} else if (buttonPressed == numbers) {
			newLotto = new TicketGeneratorGUI();
		} else if (buttonPressed == name) {
			newName = new NameMatchMakerGUI();
		} else if (buttonPressed == rune) {
			newRune = new RunesGUI(); 
		}
		else if (buttonPressed == luck) {
			if(newBall != null) {
				luckyCount += newBall.globalBall.getLuck();
			}
			if(newDice != null) {
				luckyCount += newDice.newDie.getLuck();
			}
			if(newCookie != null) {
				luckyCount += newCookie.global.getLuck();
			}
			if(newName != null) {
				luckyCount += newName.getLuck();
			}
			if(newRune != null) {
				luckyCount += newRune.runes.getLuck();
			}
			output.setText("Current Luck Count: " + luckyCount);
		}
	}
	
	/** The executable method of the Home page. 
	 * @param args Used by main. */
	public static void main(final String[] args) {
		@SuppressWarnings("unused")
		HomeGUI home = new HomeGUI();
	}
}
