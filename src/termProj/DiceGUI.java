package termProj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * An executable version of the <code>Dice</code> Class.
 * @author Natasha Speck
 * @version 1.2, 2017/02/27
 */
public class DiceGUI {
	private static final long serialVersionUID = 1L;
	Dice die0 = new Dice();
	Dice die1 = new Dice();
	JFrame dieFrame = new JFrame("Dice");
	
	JPanel diePane = new JPanel(new GridBagLayout());
	
	ImageIcon die0Image = new ImageIcon(getClass().getResource("/images/1"));
	JLabel image0Label = new JLabel(die0Image);
	
	ImageIcon die1Image = new ImageIcon(getClass().getResource("/images/1"));
	JLabel image1Label = new JLabel(die1Image);
	
	Button rollButton = new Button("Roll");
	
	TextField output = new TextField(" ");
	
	public DiceGUI() {
		//TODO set up constraints
		/*GridBagConstraints constraints = new GridBagConstraints();
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
        eightBallFrame.setVisible(true);*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
