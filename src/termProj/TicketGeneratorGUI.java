package termProj;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicketGeneratorGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	TicketGenerator globalTckt = new TicketGenerator();
	JFrame tcktFrame = new JFrame("Lottery Ticket Number Generator");
	
	JPanel tcktPane = new JPanel(new GridBagLayout());
	
	Button twoButton = new Button("Lucky Shot");
	Button threeButton = new Button("Pick Three");
	Button sixButton = new Button("Six Pairs");
	Button sevenButton = new Button("Seven Pairs");
	Button genButton = new Button("Generate Number");
	Button gen2Button = new Button("Generate Pairs");
	
	TextField output = new TextField("Please select an option.");
	
	/**
	 * Sets up a Graphics User Interface for the basic Eight Ball module.
	 *<p> Uses the <code>GridBagLayout</code> form from the Java API.
	 */
	public TicketGeneratorGUI() {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.weighty = 0.5;
		constraints.gridwidth = 6;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		tcktPane.add(output, constraints);
		output.setEditable(false);
		
		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.weighty = 0.5;
		constraints1.weightx = 0.5;
		constraints1.gridy = 1;
		constraints1.gridx = 0;
		tcktPane.add(twoButton, constraints1);
		twoButton.addActionListener(this);
		
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.weighty = 0.5;
		constraints2.weightx = 0.5;
		constraints2.gridy = 1;
		constraints2.gridx = 1;
		tcktPane.add(threeButton, constraints2);
		threeButton.addActionListener(this);
		
		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.weighty = 0.5;
		constraints3.weightx = 0.5;
		constraints3.gridy = 1;
		constraints3.gridx = 2;
		tcktPane.add(sixButton, constraints3);
		sixButton.addActionListener(this);
		
		GridBagConstraints constraints5 = new GridBagConstraints();
		constraints5.weighty = 0.5;
		constraints5.weightx = 0.5;
		constraints5.gridy = 2;
		constraints5.gridx = 0;
		tcktPane.add(sevenButton, constraints5);
		sevenButton.addActionListener(this);
		
		GridBagConstraints constraints6 = new GridBagConstraints();
		constraints6.weighty = 0.5;
		constraints6.weightx = 0.5;
		constraints6.gridy = 2;
		constraints6.gridx = 1;
		tcktPane.add(genButton, constraints6);
		genButton.addActionListener(this);
		genButton.setEnabled(false);
		
		GridBagConstraints constraints7 = new GridBagConstraints();
		constraints7.weighty = 0.5;
		constraints7.weightx = 0.5;
		constraints7.gridy = 2;
		constraints7.gridx = 2;
		tcktPane.add(gen2Button, constraints7);
		gen2Button.addActionListener(this);
		gen2Button.setEnabled(false);
		
		tcktFrame.add(tcktPane);
		tcktFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tcktFrame.pack();
        tcktFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
        Button buttonPressed = (Button) event.getSource();
        //int complete = 2;
        if(buttonPressed == twoButton)
        	output.setText(globalTckt.luckyShot());
        else if(buttonPressed == threeButton)
        	output.setText(globalTckt.pickThree());
        else if(buttonPressed == sixButton)
        	output.setText(globalTckt.sixPair());
        else if(buttonPressed == sevenButton)
        	output.setText(globalTckt.sevenPair());
        /*Non-Working Code, not promised in first release.
         * else if(buttonPressed == genButton) {
        	input.setEditable(true);
        	output.setText("Please enter a number between 1 and 50, then press 'ENTER'.");
        	
        	try {
        		Integer work = Integer.decode(input.getText());
        		complete = work.intValue();
        	} catch (NumberFormatException e) {
        		output.setText("Please enter numerical digits.");
        	}
        	
        	output.setText(globalTckt.generate(complete));
        	input.setEditable(false);
        }
        else if(buttonPressed == gen2Button) {
        	input.setEditable(true);
        	output.setText("Please enter a number between 1 and 50, then press 'ENTER'.");
        	
        	try {
				System.in.read();
			} catch (IOException e) {
				output.setText("Please press the enter key to complete.");
				e.printStackTrace();
			}
        	
        	try {
        		Integer work = Integer.decode(input.getText());
        		complete = work.intValue();
        	} catch (NumberFormatException e) {
        		output.setText("Please enter numerical digits.");
        	}
        	
        	output.setText(globalTckt.generate(complete));
        	input.setEditable(false);
        }*/
    }

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		TicketGeneratorGUI tckt = new TicketGeneratorGUI();
    }
}
