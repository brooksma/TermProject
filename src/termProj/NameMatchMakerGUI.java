package termProj;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * A basic executable GUI for the NameMatchMaker module.
 * @author Madison Brooks
 * @version 1.2, 2017/04/20
 */
public class NameMatchMakerGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1;

	/** A count of how often a user gets a lucky result. */
	private int luckyCounter;

	/** A JFrame object for the module. */
	JFrame namesFrame = new JFrame("Name Match Maker");

	/** A JPanel object for the module. */
	JPanel namesPane = new JPanel(new GridBagLayout());

	/** The image of an heart. */
	ImageIcon heartImage = new ImageIcon(getClass().
			getResource("heart.png"));

	/** The image of the heart as a JLabel. */
	JLabel heartLabel = new JLabel(heartImage);

	/** The button for the user to match the names. */
	JButton matchButton = new JButton("Match");

	/** A TextField to output results and information to the user. */
	TextField output1 = new TextField("Find your couple name!");

	/** A TextField for the user to input a name. */
	TextField input1 = new TextField("Please Enter Name One Here");

	/** A TextField for the user to input a name. */
	TextField input2 = new TextField("Please Enter Name Two Here");

	/** Returns the luck counter.
	 * @return The luck counter int. */
	public int getLuck() {
		return luckyCounter;
	}

	/**
	 * Sets up a Graphics User Interface for the basic Eight Ball module.
	 *<p> Uses the <code>GridBagLayout</code> form from the Java API.
	 */
	public NameMatchMakerGUI() {
		namesPane.setBackground(Color.WHITE);

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.weighty = 0.5;
		constraints.weightx = 0.5;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.PAGE_START;
		namesPane.add(heartLabel, constraints);

		/*For match button*/
		GridBagConstraints const1 = new GridBagConstraints();
		const1.gridx = 1;
		const1.gridy = 1;
		const1.weighty = 0.5;
		const1.weightx = 0.5;
		const1.gridwidth = 1;
		const1.gridheight = 1;
		namesPane.add(matchButton, const1);
		matchButton.addActionListener(this);
		matchButton.setEnabled(true);

		/*For output1*/
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.gridx = 1;
		constraints2.gridy = 2;
		constraints2.weighty = 0.5;
		constraints2.weightx = 0.5;
		constraints2.fill = GridBagConstraints.HORIZONTAL;
		constraints2.anchor = GridBagConstraints.CENTER;
		namesPane.add(output1, constraints2);
		output1.setEditable(false);

		/*For input one*/
		GridBagConstraints constraints4 = new GridBagConstraints();
		constraints4.gridx = 1;
		constraints4.gridy = 4;
		constraints4.weighty = 0.5;
		constraints4.weightx = 0.5;
		constraints4.fill = GridBagConstraints.HORIZONTAL;
		constraints4.anchor = GridBagConstraints.PAGE_END;
		namesPane.add(input1, constraints4);
		input1.setEditable(true);

		/*For input two*/
		GridBagConstraints constraints5 = new GridBagConstraints();
		constraints5.gridx = 1;
		constraints5.gridy = 5;
		constraints5.weighty = 0.5;
		constraints5.weightx = 0.5;
		constraints5.fill = GridBagConstraints.HORIZONTAL;
		constraints5.anchor = GridBagConstraints.PAGE_END;
		namesPane.add(input2, constraints5);
		input2.setEditable(true);

		namesFrame.add(namesPane);
		namesFrame.setDefaultCloseOperation(
				JFrame.DISPOSE_ON_CLOSE);
		namesFrame.pack();
		namesFrame.setVisible(true);
	}

	/**
	 * Finds if an action was performed and then alters the GUI accordingly.
	 * @param event the Action performed
	 */
	public void actionPerformed(final ActionEvent event) {
        JButton buttonPressed = (JButton) event.getSource();
        if (buttonPressed == matchButton) {
        	String out = "";
        	String in1 = input1.getText();
        	String in2 = input2.getText();
			if (in1.length() < 4 || in2.length() < 4) {
        		out = "Names must be longer than 4 characters";
			} else {
        		out = "Your couple name is " + in1.substring(0, 3)
        		+ in2.substring(in2.length() - 3, in2.length());
        		luckyCounter = luckyCounter + 1;
        	}
        	output1.setText(out);
        }
	}
}
