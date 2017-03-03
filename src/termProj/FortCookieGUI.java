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
			"/images/fortune_cookie_unbroken.jpg.png"));
	/** A JLabel for the image of a fortune cookie. */
	JLabel imageLabel = new JLabel(cookieImage1);
		
	/** A button for the user to receive a fortune. */
	JButton breakButton = new JButton("Break");
	
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
		constraints2.gridy = 2;
		constraints2.weighty = 1.0;
		constraints2.weightx = 1.0;
		constraints2.fill = GridBagConstraints.HORIZONTAL;
		constraints2.anchor = GridBagConstraints.CENTER;
		cookiePanel.add(output, constraints2);
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
	        output.setText("Your fortune: " + global.breakCookie());
	    }
	}

	/** Executable for a FortCookie module. 
	 * @param args Used in main. */
	public static void main(final String[] args) {
		@SuppressWarnings("unused")
		FortCookieGUI fortune = new FortCookieGUI();
    }
}
