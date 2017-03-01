package termProj;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeGUI  extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JMenuBar menuBar = new JMenuBar();
	JMenu personalize;
	JMenuItem red, green, blue;
	
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
		
		//Set up the Personalize menu
	    personalize = new JMenu("Personalize");
	    personalize.setMnemonic(KeyEvent.VK_A);
	    personalize.getAccessibleContext().setAccessibleDescription("Personalize the homepage!");
	    
	    //Set up the colour options
	    red = new JMenuItem("Red", KeyEvent.VK_T);
	    red.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
	    red.getAccessibleContext().setAccessibleDescription("Turn the background red.");
	    red.addActionListener(this);
	    personalize.add(red);
	    
	    green = new JMenuItem("Red", KeyEvent.VK_T);
	    green.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
	    green.getAccessibleContext().setAccessibleDescription("Turn the background green.");
	    green.addActionListener(this);
	    personalize.add(green);
	    
	    blue = new JMenuItem("Red", KeyEvent.VK_T);
	    blue.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
	    blue.getAccessibleContext().setAccessibleDescription("Turn the background blue.");
	    blue.addActionListener(this);
	    personalize.add(blue);
	    
	    //Complete the Menu
	    menuBar.add(personalize); 
	    homeFrame.setJMenuBar(menuBar);
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
		Button buttonPressed = (Button) e.getSource();
		EightBallGUI newball;
		FortCookieGUI newCookie;
		TicketGeneratorGUI newLotto;
		//DiceGUI newDie;
		if (e.getSource() == red)
			homePanel.setBackground(Color.RED);
		else if(e.getSource() == green)
			homePanel.setBackground(Color.GREEN);
		else if(e.getSource() == blue)
			homePanel.setBackground(Color.BLUE);
		else if (buttonPressed == ball)
			newball = new EightBallGUI();
		//else if (buttonPressed == dice)
			// newDie = new DiceGUI();
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
