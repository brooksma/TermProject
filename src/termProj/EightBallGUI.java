package termProj;

import java.awt.Button;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A basic executable GUI for the Magic Eight Ball module.
 * @author Natasha Speck
 * @version 1.2, 2017/02/26
 */
public class EightBallGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	EightBall globalBall = new EightBall();
	JFrame eightBallFrame = new JFrame("Magic Eight Ball");
	
	JPanel eightBallPane = new JPanel(new GridBagLayout());
	
	ImageIcon eightBallImage = new ImageIcon(getClass().getResource("/images/8_ball_thumb.png"));
	JLabel imageLabel = new JLabel(eightBallImage);
	
	Button shakeButton = new Button("Shake");
	Button retryButton = new Button("Try Again");
	
	TextField output = new TextField("Please ask a yes or no question.");
	TextField input = new TextField();
	
	/**
	 * Sets up a Graphics User Interface for the basic Eight Ball module.
	 *<p> Uses the <code>GridBagLayout</code> form from the Java API.
	 */
	public EightBallGUI() {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.weighty = 0.5;
		constraints.weightx = 0.5;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.PAGE_START;
		eightBallPane.add(imageLabel, constraints);	
		
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
		eightBallFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eightBallFrame.pack();
        eightBallFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
        Button buttonPressed = (Button) event.getSource();
        if(buttonPressed == shakeButton) {
        	int start = globalBall.luckyCounter;
        	output.setText("'" + input.getText() + "'" + " " + globalBall.shakeBall());
        	if(start == globalBall.luckyCounter)
        		retryButton.setEnabled(true);
        	else {
        		retryButton.setEnabled(false);
        		input.setText("Another question?");
        	}
        }
        else if(buttonPressed == retryButton) {
        	output.setText(input.getText() + " " + globalBall.shakeBall());
        	retryButton.setEnabled(false);
        }
    }

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		EightBallGUI eight = new EightBallGUI();
    }
}
