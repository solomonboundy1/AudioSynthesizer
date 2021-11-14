package com.qa.synth.main;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class synthRemasteredGUI {
	
	private JFrame frame =  new JFrame("Synthesizer Remastered");
	
	synthRemasteredGUI() {
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setSize(613, 357);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
