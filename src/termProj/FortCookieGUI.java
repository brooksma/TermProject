package termProj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//basic GUI for FortCookie
public class FortCookieGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	FortCookie global = new FortCookie();
	JFrame cookieFrame = new JFrame("Fortune Cookie");
	
	JPanel cookiePanel = new JPanel(new GridBagLayout());
	
	ImageIcon cookieImage1 = new ImageIcon(getClass().getResource("fortune_cookie_unbroken.jpg"));
	JLabel imageLabel = new JLabel(cookieImage1);
		
	Button breakButton = new Button("Break");
		
	TextField output = new TextField();
		
	//basic GUI setup for Fortune Cookie
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
		
	public void actionPerformed(ActionEvent event) {
		Button buttonPressed = (Button) event.getSource();
	    if(buttonPressed == breakButton) {
	        output.setText("Your fortune: " + global.breakCookie());
	    }
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		FortCookieGUI fortune = new FortCookieGUI();
    }
}