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
 * A basic executable GUI for the Magic Eight Ball module.
 * @author Natasha Speck
 * @version 1.2, 2017/02/26
 */
public class EightBallGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	/** An EightBall object for the module. */
	EightBall globalBall = new EightBall();
	/** A JFrame object for the module. */
	JFrame eightBallFrame = new JFrame("Magic Eight Ball");
	/** A JPanel object for the module. */
	JPanel eightBallPane = new JPanel(new GridBagLayout());
	
	/** The image of an eight ball. */
	ImageIcon eightBallImage = new ImageIcon(getClass().
			getResource("/images/eight_ball.jpg"));
	/** The image of a shaken eight ball. */
	ImageIcon eightBallImage2 = new ImageIcon(getClass().
			getResource("/images/shaken_eight_ball.jpg"));
	/** The image of an eight ball as a JLabel. */
	JLabel imageLabel = new JLabel(eightBallImage);
	/** The image of a shaken eight ball as a JLabel. */
	JLabel imageLabel2 = new JLabel(eightBallImage2);
	
	/** The button for the user to shake the eight ball. */
	JButton shakeButton = new JButton("Shake");
	/** The button for the user to try the same question again. */
	JButton retryButton = new JButton("Try Again");
	
	/** A TextField to output results and information to the user. */
	TextField output = new TextField("Please ask a yes or no question.");
	/** A TextField for the user to input a query. */
	TextField input = new TextField();
	
	/**
	 * Sets up a Graphics User Interface for the basic Eight Ball module.
	 *<p> Uses the <code>GridBagLayout</code> form from the Java API.
	 */
	public EightBallGUI() {
		eightBallPane.setBackground(Color.WHITE);
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.weighty = 0.5;
		constraints.weightx = 0.5;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.PAGE_START;
		eightBallPane.add(imageLabel, constraints);	
		
		eightBallPane.add(imageLabel2, constraints);
		imageLabel2.setVisible(false);
		
		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.gridx = 1;
		constraints1.gridy = 1;
		constraints1.weighty = 0.5;
		constraints1.weightx = 0.5;
		constraints1.gridwidth = 1;
		constraints1.gridheight = 1;
		eightBallPane.add(shakeButton, constraints1);
		shakeButton.addActionListener(this);
		shakeButton.setEnabled(true);
		
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.gridx = 1;
		constraints2.gridy = 4;
		constraints2.weighty = 0.5;
		constraints2.weightx = 0.5;
		constraints2.gridwidth = 1;
		constraints2.gridheight = 1;
		eightBallPane.add(retryButton, constraints2);
		retryButton.addActionListener(this);
		retryButton.setEnabled(false);
		
		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.gridx = 1;
		constraints3.gridy = 2;
		constraints3.weighty = 0.5;
		constraints3.weightx = 0.5;
		constraints3.fill = GridBagConstraints.HORIZONTAL;
		constraints3.anchor = GridBagConstraints.CENTER;
		eightBallPane.add(output, constraints3);
		output.setEditable(false);
		
		GridBagConstraints constraints4 = new GridBagConstraints();
		constraints4.gridx = 1;
		constraints4.gridy = 3;
		constraints4.weighty = 0.5;
		constraints4.weightx = 0.5;
		constraints4.fill = GridBagConstraints.HORIZONTAL;
		constraints4.anchor = GridBagConstraints.PAGE_END;
		eightBallPane.add(input, constraints4);
		input.setEditable(true);
		
		eightBallFrame.add(eightBallPane);
		eightBallFrame.setDefaultCloseOperation(
				JFrame.DISPOSE_ON_CLOSE);
        eightBallFrame.pack();
        eightBallFrame.setVisible(true);
	}
	
	/**
	 * Finds if an action was performed and then alters the GUI accordingly.
	 * @param event the Action performed
	 */
	public void actionPerformed(final ActionEvent event) {
        JButton buttonPressed = (JButton) event.getSource();
        if (buttonPressed == shakeButton) {
        	int start = globalBall.getLuck();
        	output.setText("'" + input.getText() + "'" 
        			+ " " + globalBall.shakeBall());		
        	imageLabel.setVisible(false);
        	imageLabel2.setVisible(true);
        	if (start > globalBall.getLuck()) {
        		retryButton.setEnabled(false);
        		shakeButton.setEnabled(true);
        		imageLabel.setVisible(true);
        		imageLabel2.setVisible(false);
        	} else {
        		retryButton.setEnabled(true);
        		input.setText("Another question?");
        	}
        } else if (buttonPressed == retryButton) {
        	output.setText(input.getText() + " " + globalBall.shakeBall());
        	retryButton.setEnabled(false);
        	imageLabel.setVisible(true);
        	imageLabel2.setVisible(false);
        }
    }
}
