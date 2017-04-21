package termProj;

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

/** A basic GUI for a FortCookie. */
public class FortCookieGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	/** A FortCookie object. */
	FortCookie global = new FortCookie();

	/** A JFrame to house a FortCookie module. */
	JFrame cookieFrame = new JFrame("Fortune Cookie");
	/** A JPanel to house a FortCookie module. */
	JPanel cookiePanel = new JPanel(new GridBagLayout());

	/** An ImageIcon of a fortune cookie. */
	ImageIcon cookieImage1 = new ImageIcon(getClass().getResource(
			"fortune_cookie_unbroken.jpg"));
	/** A JLabel for the image of a fortune cookie. */
	JLabel imageLabel = new JLabel(cookieImage1);

	/** An ImageIcon of a broken fortune cookie. */
	ImageIcon cookieImage2 = new ImageIcon(getClass().getResource(
			"broken_fortune_cookie.jpg"));
	/** A JLabel for the image of a broken fortune cookie. */
	JLabel imageLabel2 = new JLabel(cookieImage2);

	/** A button for the user to receive a fortune. */
	JButton breakButton = new JButton("Break");

	/** A button for the user to receive another fortune. */
	JButton againButton = new JButton("Again");

	/** A TextField for the fortune to be displayed. */
	TextField output = new TextField();

	/** Constructs a FortCookieGUI in a JPanel and JFrame. */
	public FortCookieGUI() {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.weighty = 1.0;
		constraints.weightx = 1.0;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.PAGE_START;
		cookiePanel.add(imageLabel, constraints);
		cookiePanel.add(imageLabel2, constraints);
		imageLabel2.setVisible(false);

		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.gridx = 1;
		constraints1.gridy = 1;
		constraints1.weighty = 1.0;
		constraints1.weightx = 1.0;
		cookiePanel.add(breakButton, constraints1);
		breakButton.addActionListener(this);
		breakButton.setEnabled(true);

		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.gridx = 1;
		constraints2.gridy = 3;
		constraints2.weighty = 1.0;
		constraints2.weightx = 1.0;
		cookiePanel.add(againButton, constraints2);
		againButton.addActionListener(this);
		againButton.setEnabled(false);

		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.gridx = 1;
		constraints3.gridy = 4;
		constraints3.weighty = 1.0;
		constraints3.weightx = 1.0;
		constraints3.fill = GridBagConstraints.HORIZONTAL;
		constraints3.anchor = GridBagConstraints.CENTER;
		cookiePanel.add(output, constraints3);
		output.setEditable(false);

		cookieFrame.add(cookiePanel);
		cookieFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    cookieFrame.pack();
	    cookieFrame.setVisible(true);
	}

	/** Checks to see if a button was selected.
	 * @param event The button selected. */
	public void actionPerformed(final ActionEvent event) {
		JButton buttonPressed = (JButton) event.getSource();
	    if (buttonPressed == breakButton) {
	        output.setText("Fortune: " + global.breakCookie());
	        imageLabel.setVisible(false);
	        imageLabel2.setVisible(true);
	        againButton.setEnabled(true);
	        breakButton.setEnabled(false);
	    }

	    if (buttonPressed == againButton) {
	    	output.setText("");
	    	imageLabel.setVisible(true);
	    	imageLabel2.setVisible(false);
	    	againButton.setEnabled(false);
	    	breakButton.setEnabled(true);
	    }
	}
}
