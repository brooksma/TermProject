package termProj;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeGUI  extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JFrame homeFrame = new JFrame("Test Your Luck");
	JPanel homePanel = new JPanel(new GridLayout(1,2));
	
	Button fortune = new Button("Fourtune Cookie");
	Button ball = new Button("Magic 8-Ball");
	Button numbers = new Button("Lotto Ticket Number Generator");
	Button dice = new Button("Roll the Dice");
	
	TextField output = new TextField("Welcome! Please select an option.");
	
	/**
	 * Sets up a Graphics User Interface for the basic Ticket Generator module.
	 *<p> Uses the <code>GridBagLayout</code> form from the Java API.
	 */
	public HomeGUI() {
		/* Welcome Message to the user*/
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.weighty = 2;
		constraints.gridwidth = 2;
		constraints.gridheight = 2;
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		homePanel.add(output, constraints);
		output.setEditable(false);
		
		/* Dice Button */
		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.gridx = 2;
		constraints1.gridy = 0;
		constraints1.weighty = 0.5;
		constraints1.weightx = 0.5;
		homePanel.add(dice, constraints1);
		dice.addActionListener(this);
		
		/* 8 Ball Button */
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.gridx = 2;
		constraints2.gridy = 1;
		constraints2.weighty = 0.5;
		constraints2.weightx = 0.5;
		homePanel.add(ball, constraints2);
		ball.addActionListener(this);
		
		/* Ticket Generator*/
		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.gridx = 2;
		constraints3.gridy = 2;
		constraints3.weighty = 0.5;
		constraints3.weightx = 0.5;
		homePanel.add(numbers, constraints3);
		numbers.addActionListener(this);
		
		/* Fortune Cookie */
		GridBagConstraints constraints4 = new GridBagConstraints();
		constraints4.gridx = 2;
		constraints4.gridy = 3;
		constraints4.weighty = 0.5;
		constraints4.weightx = 0.5;
		homePanel.add(fortune, constraints4);
		fortune.addActionListener(this);
		
		homeFrame.add(homePanel);
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.pack();
        homeFrame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button buttonPressed = (Button) e.getSource();
		EightBallGUI newball;
		FortCookieGUI newCookie;
		TicketGeneratorGUI newLotto;
		if (buttonPressed == ball)
			newball = new EightBallGUI();
		//if (buttonPressed == dice)
			// to do
		if (buttonPressed == fortune)
			newCookie = new FortCookieGUI();
		if (buttonPressed == numbers)
			newLotto = new TicketGeneratorGUI();
	}
	
	public static void main(String[] args){
		@SuppressWarnings("unused")
		HomeGUI home = new HomeGUI();
	}
}
