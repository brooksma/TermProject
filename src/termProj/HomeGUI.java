package termProj;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class HomeGUI  extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JMenuBar menuBar = new JMenuBar();
	JMenuItem red, green, blue;
	
	JFrame homeFrame = new JFrame("Test Your Luck");
	JPanel homePanel = new JPanel(new GridLayout(1,2));
	
	JButton fortune = new JButton("Fortune Cookie");
	JButton ball = new JButton("Magic 8-Ball");
	JButton numbers = new JButton("Lotto Ticket Number Generator");
	JButton dice = new JButton("Roll the Dice");
	
	TextField output = new TextField("Welcome! Please select an option.");
	
	EightBallGUI newBall;
	FortCookieGUI newCookie;
	DiceGUI newDice;
	TicketGeneratorGUI newLotto;
	
	/**
	 * Sets up a Graphics User Interface for the basic Ticket Generator module.
	 *<p> Uses the <code>GridBagLayout</code> form from the Java API.
	 */
	public HomeGUI() {
		
		setJMenuBar(menuBar);
		JMenu colorMenu = new JMenu("Color");
		red = colorMenu.add("Red");
		green = colorMenu.add("Green");
		blue = colorMenu.add("Blue");
		ButtonGroup choice = new ButtonGroup();
		choice.add(red);
		choice.add(green);
		choice.add(blue);
		menuBar.add(colorMenu); 
		menuBar.setVisible(true); 
		 	    
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
        homeFrame.setBounds(50, 50, 1000, 200);
        homeFrame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == ball)
			newBall = new EightBallGUI();
		if (buttonPressed == dice)
			newDice = new DiceGUI();
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
