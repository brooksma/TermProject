package termProj;

import java.awt.Button;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EightBallGUI extends JFrame implements ActionListener {
	/**
	 * 
	 */
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
	
	public EightBallGUI() {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.PAGE_START;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.gridx = 1;
		eightBallPane.add(imageLabel, constraints);	
		
		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.gridx = 0;
		constraints1.gridy = 1;
		eightBallPane.add(shakeButton, constraints1);
		shakeButton.addActionListener(this);
		shakeButton.setEnabled(true);
		
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.gridx = 2;
		constraints2.gridy = 1;
		eightBallPane.add(retryButton, constraints2);
		retryButton.addActionListener(this);
		retryButton.setEnabled(false);
		
		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.gridx = 3;
		constraints3.fill = GridBagConstraints.HORIZONTAL;
		eightBallPane.add(output, constraints3);
		output.setEditable(false);
		
		GridBagConstraints constraints4 = new GridBagConstraints();
		constraints4.gridx = 4;
		constraints4.fill = GridBagConstraints.HORIZONTAL;
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
        	output.setText(input.getText() + "\n" + globalBall.shakeBall());
        	if(start == globalBall.luckyCounter)
        		retryButton.setEnabled(true);
        	else {
        		retryButton.setEnabled(false);
        		input.setText("Another question?");
        	}
        }
        else if(buttonPressed == retryButton) {
        	output.setText(input.getText() + "\n" + globalBall.shakeBall());
        	retryButton.setEnabled(false);
        }
    }

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		EightBallGUI eight = new EightBallGUI();
    }
}


