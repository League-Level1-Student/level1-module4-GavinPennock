package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	JFrame frame = new JFrame("type or be shamed");
	char currentLetter;
	JLabel label = new JLabel();
	JPanel panel = new JPanel();

	public void run() {
		frame.addKeyListener(this);
		frame.setSize(1000,500);
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char keypressed=e.getKeyChar();
		System.out.println("you pressed: "+keypressed);
		if(keypressed==currentLetter) {
			frame.setBackground(Color.green);
		}else{
			frame.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		
	}
}
