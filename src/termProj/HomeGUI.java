package termProj;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeGUI  extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JFrame homeFrame = new JFrame("Test Your Luck");
	JPanel homePanel = new JPanel(new GridLayout(3,5));
	
	JButton color = new JButton("Background Color");
	JButton fortune = new JButton("Fortune Cookie");
	JButton ball = new JButton("Magic 8-Ball");
	JButton numbers = new JButton("Lotto Ticket Number Generator");
	JButton dice = new JButton("Roll the Dice");
	
	Label output = new Label("Welcome! Please select an option.");
	
	Object[] options = {"Red" , "Green" , "Blue" };
	String colour;
	
	EightBallGUI newBall;
	FortCookieGUI newCookie;
	TicketGeneratorGUI newLotto;
	DiceGUI newDice;
	
		
	/**
	 * Sets up a Graphics User Interface for the basic Ticket Generator module.
	 *<p> Uses the <code>GridBagLayout</code> form from the Java API.
	 */
	public HomeGUI() {
	    
		/* Welcome Message to the user*/
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 3;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.PAGE_START;
		homePanel.add(output, constraints);
		
		//Personalization
		GridBagConstraints constraints0 = new GridBagConstraints();
		constraints0.gridx = 3;
		constraints0.gridy = 1;
		constraints0.fill = GridBagConstraints.HORIZONTAL;
		homePanel.add(color, constraints0);
		color.addActionListener(this);
		
		
		/* Dice Button */
		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.gridx = 0;
		constraints1.gridy = 2;
		homePanel.add(dice, constraints1);
		dice.addActionListener(this);
		
		/* 8 Ball Button */
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.gridx = 1;
		constraints2.gridy = 2;
		homePanel.add(ball, constraints2);
		ball.addActionListener(this);
		
		/* Ticket Generator*/
		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.gridx = 3;
		constraints3.gridy = 2;
		homePanel.add(numbers, constraints3);
		numbers.addActionListener(this);
		
		/* Fortune Cookie */
		GridBagConstraints constraints4 = new GridBagConstraints();
		constraints4.gridx = 4;
		constraints4.gridy = 2;
		homePanel.add(fortune, constraints4);
		fortune.addActionListener(this);
		
		homeFrame.add(homePanel);
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.pack();
        homeFrame.setBounds(50, 50, 1000, 200);
        homeFrame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed == color) {
			colour = (String) JOptionPane.showInputDialog(homeFrame, "Select a color", "Background Color", JOptionPane.QUESTION_MESSAGE,
					null, options, options[2]);
			if(colour.equals(options[0])) {
				homePanel.setBackground(new Color(125, 0, 0));
				color.setBackground(new Color(125, 0, 0));
				color.setForeground(Color.WHITE);
				color.setOpaque(true);
				ball.setBackground(new Color(125, 0, 0));
				ball.setForeground(Color.WHITE);
				ball.setOpaque(true);
				dice.setBackground(new Color(125, 0, 0));
				dice.setForeground(Color.WHITE);
				dice.setOpaque(true);
				fortune.setBackground(new Color(125, 0, 0));
				fortune.setForeground(Color.WHITE);
				fortune.setOpaque(true);
				numbers.setBackground(new Color(125, 0, 0));
				numbers.setForeground(Color.WHITE);
				numbers.setOpaque(true);
				output.setBackground(new Color(125, 0, 0));
				output.setForeground(Color.WHITE);
			}
			else if(colour.equals(options[1])) {
				homePanel.setBackground(new Color(0, 125, 0));
				color.setBackground(new Color(0, 125, 0));
				color.setForeground(Color.WHITE);
				color.setOpaque(true);
				ball.setBackground(new Color(0, 125, 0));
				ball.setForeground(Color.WHITE);
				ball.setOpaque(true);
				dice.setBackground(new Color(0, 125, 0));
				dice.setForeground(Color.WHITE);
				dice.setOpaque(true);
				fortune.setBackground(new Color(0, 125, 0));
				fortune.setForeground(Color.WHITE);
				fortune.setOpaque(true);
				numbers.setBackground(new Color(0, 125, 0));
				numbers.setForeground(Color.WHITE);
				numbers.setOpaque(true);
				output.setBackground(new Color(0, 125, 0));
				output.setForeground(Color.WHITE);
			}
			else if(colour.equals(options[2])) {
				homePanel.setBackground(new Color(0, 0, 125));
				color.setBackground(new Color(0, 0, 125));
				color.setForeground(Color.WHITE);
				color.setOpaque(true);
				ball.setBackground(new Color(0, 0, 125));
				ball.setForeground(Color.WHITE);
				ball.setOpaque(true);
				dice.setBackground(new Color(0, 0, 125));
				dice.setForeground(Color.WHITE);
				dice.setOpaque(true);
				fortune.setBackground(new Color(0, 0, 125));
				fortune.setForeground(Color.WHITE);
				fortune.setOpaque(true);
				numbers.setBackground(new Color(0, 0, 125));
				numbers.setForeground(Color.WHITE);
				numbers.setOpaque(true);
				output.setBackground(new Color(0, 0, 125));
				output.setForeground(Color.WHITE);
			}
		}
		else if (buttonPressed == ball)
			newBall = new EightBallGUI();
		else if (buttonPressed == dice)
			newDice = new DiceGUI();
		else if (buttonPressed == fortune)
			newCookie = new FortCookieGUI();
		else if (buttonPressed == numbers)
			newLotto = new TicketGeneratorGUI();
	}
	
	public static void main(String[] args){
		@SuppressWarnings("unused")
		HomeGUI home = new HomeGUI();
	}
}
