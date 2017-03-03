package termProj;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** An executable GUI for a TicketGenerator module. */
public class TicketGeneratorGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	/** A TicketGenerator object. */
	TicketGenerator globalTckt = new TicketGenerator();
	/** A JFrame to house a TicketGenerator module. */
	JFrame tcktFrame = new JFrame("Lottery Ticket Number Generator");
	/** A JFrame to house a TicketGenerator module's components. */
	JPanel tcktPane = new JPanel(new GridBagLayout());
	
	/** A button for the user to generate a Lucky Shot. */
	JButton twoButton = new JButton("Lucky Shot");
	/** A button for the user to generate a Pick Three. */
	JButton threeButton = new JButton("Pick Three");
	/** A button for the user to generate Six Pairs. */
	JButton sixButton = new JButton("Six Pairs");
	/** A button for the user to generate Seven Pairs. */
	JButton sevenButton = new JButton("Seven Pairs");
	/** A button for the user to generate their own number, RELEASE 02. */
	JButton genButton = new JButton("Generate Number");
	/** A button for the user to generate their own pairs, RELEASE 02. */
	JButton gen2Button = new JButton("Generate Pairs");
	
	/** A TextField for the module to interact with the user. */
	TextField output = new TextField("Please select an option.");
	
	/**
	 * Sets up a Graphics User Interface for the basic Eight Ball module.
	 *<p> Uses the <code>GridBagLayout</code> form from the Java API.
	 */
	public TicketGeneratorGUI() {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.weighty = 0.5;
		constraints.gridwidth = 6;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		tcktPane.add(output, constraints);
		output.setEditable(false);
		
		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.weighty = 0.5;
		constraints1.weightx = 0.5;
		constraints1.gridy = 1;
		constraints1.gridx = 0;
		tcktPane.add(twoButton, constraints1);
		twoButton.addActionListener(this);
		
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.weighty = 0.5;
		constraints2.weightx = 0.5;
		constraints2.gridy = 1;
		constraints2.gridx = 1;
		tcktPane.add(threeButton, constraints2);
		threeButton.addActionListener(this);
		
		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.weighty = 0.5;
		constraints3.weightx = 0.5;
		constraints3.gridy = 1;
		constraints3.gridx = 2;
		tcktPane.add(sixButton, constraints3);
		sixButton.addActionListener(this);
		
		GridBagConstraints constraints5 = new GridBagConstraints();
		constraints5.weighty = 0.5;
		constraints5.weightx = 0.5;
		constraints5.gridy = 2;
		constraints5.gridx = 0;
		tcktPane.add(sevenButton, constraints5);
		sevenButton.addActionListener(this);
		
		GridBagConstraints constraints6 = new GridBagConstraints();
		constraints6.weighty = 0.5;
		constraints6.weightx = 0.5;
		constraints6.gridy = 2;
		constraints6.gridx = 1;
		tcktPane.add(genButton, constraints6);
		genButton.addActionListener(this);
		genButton.setEnabled(false);
		
		GridBagConstraints constraints7 = new GridBagConstraints();
		constraints7.weighty = 0.5;
		constraints7.weightx = 0.5;
		constraints7.gridy = 2;
		constraints7.gridx = 2;
		tcktPane.add(gen2Button, constraints7);
		gen2Button.addActionListener(this);
		gen2Button.setEnabled(false);
		
		tcktFrame.add(tcktPane);
		tcktFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tcktFrame.pack();
        tcktFrame.setVisible(true);
	}
	
	/** Checks to see which button was selected. 
	 * @param event The button selected by the user. */
	public void actionPerformed(final ActionEvent event) {
        JButton buttonPressed = (JButton) event.getSource();
        if (buttonPressed == twoButton) {
        	output.setText(globalTckt.luckyShot());
        } else if (buttonPressed == threeButton) {
        	output.setText(globalTckt.pickThree());
        } else if (buttonPressed == sixButton) {
        	output.setText(globalTckt.sixPair());
        } else if (buttonPressed == sevenButton) {
        	output.setText(globalTckt.sevenPair());
        }
    }
}
