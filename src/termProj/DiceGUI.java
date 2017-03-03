package termProj;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * An executable version of the <code>Dice</code> Class.
 * @author Natasha Speck
 * @version 1.2, 2017/02/27
 */
public class DiceGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	/** A Dice object. */
	Dice newDie = new Dice();
	/** An int holding the face number of one die. */
	private int die0 = 1; 
	/** An int holding the face number of one die. */
	private int die1 = 6; 
	/** A JFrame for the Dice module. */
	JFrame dieFrame = new JFrame("Dice"); 
	
	/** A JPanel for the Dice module. Uses <code>GridBagLayout</code>. */
	JPanel diePane = new JPanel(new GridBagLayout());
	
	/** An ImageIcon for a die, holds the specified die's face
	 *  number image. */
	ImageIcon die0Image = new ImageIcon(getClass().getResource(die0 
			+ ".png"));
	/** Places the die's ImageIcon in a JLabel for simpler display. */
	JLabel image0Label = new JLabel(die0Image);
	
	/** An ImageIcon for a die, holds the specified die's 
	 * face number image. */
	ImageIcon die1Image = new ImageIcon(getClass().getResource(die1
			+ ".png"));
	/** Places the die's ImageIcon in a JLabel for simpler display. */
	JLabel image1Label = new JLabel(die1Image);
	
	/** A URL to hold the mobile image shown upon getting snake eyes. */
	URL fire = getClass().getResource("fireworks.gif");
	/** An ImageIcon to hold the mobile image shown upon  getting 
	 * snake eyes. */
	Icon fireIcon = new ImageIcon(fire);
	/** Places the mobile image in a JLabel for simpler display. */
	JLabel fireLabel = new JLabel(fireIcon);
	
	/** The button for the user to roll both dice. */
	JButton rollButton = new JButton("Roll");
	
	/** The reward message given to a user who rolls two ones. */
	TextField output = new TextField("Snake Eyes!");
	
	/** An executable form for the Dice module of the Digital Fortune 
	 * Teller. */
	public DiceGUI() {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weightx = 0.5;
		constraints.weighty = 0.5;
		constraints.anchor = GridBagConstraints.PAGE_START;
		diePane.add(image0Label,  constraints);
		
		GridBagConstraints constraints0 = new GridBagConstraints();
		constraints0.gridx = 1;
		constraints0.gridy = 0;
		constraints.weightx = 0.5;
		constraints.weighty = 0.5;
		diePane.add(fireLabel, constraints0);
		fireLabel.setVisible(false);
		
		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.gridx = 2;
		constraints1.gridy = 0;
		constraints1.weightx = 0.5;
		constraints1.weighty = 0.5;
		constraints1.anchor = GridBagConstraints.PAGE_START;
		diePane.add(image1Label,  constraints1);
		
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.gridx = 1;
		constraints2.gridy = 1;
		constraints2.weightx = 0.5;
		constraints2.weighty = 0.5;
		constraints2.anchor = GridBagConstraints.CENTER;
		diePane.add(rollButton, constraints2);
		rollButton.addActionListener(this);
		rollButton.setEnabled(true);
		
		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.gridx = 1;
		constraints3.gridy = 2;
		constraints3.fill = GridBagConstraints.HORIZONTAL;
		constraints3.anchor = GridBagConstraints.PAGE_END;
		constraints3.weightx = 0.5;
		constraints3.weighty = 0.5;
		output.setEditable(false);
		output.setVisible(false);
		diePane.add(output, constraints3);
		
		dieFrame.add(diePane);
		dieFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		dieFrame.pack();
		dieFrame.setVisible(true);
	}
	
	/** Returns die0. 
	 * @return The die0 private int. */
	public int getDie0() {
		return die0;
	}
	
	/** Returns die1.
	 * @return The die1 private int. */
	public int getDie1() {
		return die1;
	}
	
	/** Checks to see what button was pressed. 
	 * @param event The event fired by the user. */
	public void actionPerformed(final ActionEvent event) {
		JButton buttonPressed = (JButton) event.getSource();
		
        if (buttonPressed == rollButton) {
        	if (output.isVisible()) {
        		output.setVisible(false);
        		fireLabel.setVisible(false);
        		dieFrame.pack();
        	}
        	die0 = newDie.roll();
        	die1 = newDie.roll();
        	die0Image = new ImageIcon(getClass().
        			getResource(die0 + ".png"));
        	image0Label.setIcon(die0Image);
        	die1Image = new ImageIcon(getClass().
        			getResource(die1 + ".png"));
        	image1Label.setIcon(die1Image);
        	
        	if (die0 == 1 && die1 == 1) {
        		output.setVisible(true);
        		fireLabel.setVisible(true);
        		dieFrame.pack();
        	}
        }
	}
}
