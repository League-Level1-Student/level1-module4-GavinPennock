package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class latestTweet implements ActionListener {
	JFrame frame = new JFrame("latest tweet");
	JTextField field = new JTextField();
	JButton button = new JButton("serch twitter \n\n\n who still uses twitter?");

	public void run() {
		frame.add(field);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("tweet tweet");
		
	}
}
