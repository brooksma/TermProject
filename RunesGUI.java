/**
 * 
 */
package termProj;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** An executable version of the <code>Runes</code> class.
 * @author Natasha Speck
 * @version 1.1 2017/04/19
 */
public class RunesGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	/** A <code>Runes</code> object. */
	Runes runes = new Runes();

	/** A <code>Rune</code> object.*/
	private Rune rune = new Rune();

	/** A JFrame for the Runes module. */
	private JFrame runeFrame = new JFrame();
	/** A JPanel for the Runes module. Uses <code>GridBagLayout</code>. */
	private JPanel runePane = new JPanel(new GridBagLayout());

	/** The button for the user to enter their query. */
	JButton seekButton = new JButton("Seek Guidance");

	/** A JLabel to output the generated rune's name. */
	JLabel name = new JLabel("Rune Generator");

	/** A JLabel to output results and information to the user. */
	JLabel output = new JLabel("Tell the runes the one word"
			+ " at the very heart of your troubles.");
	/** A TextField for the user to input a query. */
	TextField input = new TextField();

	/** Sets up a Graphics User Interface for the basic Runes module.
	 *<p> Uses the <code>GridBagLayout</code> form from the Java API.
	 */
	public RunesGUI() {
		runePane.setBackground(new Color(211, 211, 190));

		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.gridx = 1;
		constraints1.gridy = 4;
		constraints1.weighty = 0.5;
		constraints1.weightx = 0.5;
		constraints1.gridwidth = 1;
		constraints1.gridheight = 1;
		runePane.add(seekButton, constraints1);
		seekButton.addActionListener(this);
		seekButton.setEnabled(true);

		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.gridx = 1;
		constraints3.gridy = 2;
		constraints3.weighty = 0.5;
		constraints3.weightx = 0.5;
		constraints3.fill = GridBagConstraints.HORIZONTAL;
		runePane.add(output, constraints3);

		GridBagConstraints constraints5 = new GridBagConstraints();
		constraints5.gridx = 1;
		constraints5.gridy = 1;
		constraints5.weighty = 0.5;
		constraints5.weightx = 0.5;
		constraints5.fill = GridBagConstraints.HORIZONTAL;
		constraints5.anchor = GridBagConstraints.BELOW_BASELINE;
		runePane.add(name, constraints5);

		GridBagConstraints constraints4 = new GridBagConstraints();
		constraints4.gridx = 1;
		constraints4.gridy = 3;
		constraints4.weighty = 0.5;
		constraints4.weightx = 0.5;
		constraints4.fill = GridBagConstraints.HORIZONTAL;
		constraints4.anchor = GridBagConstraints.PAGE_END;
		runePane.add(input, constraints4);
		input.setEditable(true);

		runeFrame.add(runePane);
		runeFrame.setDefaultCloseOperation(
				JFrame.DISPOSE_ON_CLOSE);
        runeFrame.pack();
        runeFrame.setVisible(true);
	}

	@Override
	/** This method allows the <code>RunesGUI</code> to watch for
	 * whether the JButton is pressed, and to act accordingly.
	 * @param e is the event which triggers the method. */
	public void actionPerformed(final ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == seekButton) {
			rune = runes.seekGuidance(input.getText());
			output.setText(rune.getMessage());
			name.setText(rune.getName());
			runeFrame.pack();
		}
	}
}
