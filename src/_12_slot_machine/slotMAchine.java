package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotMAchine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel slot1 = new JLabel();
	JLabel slot2 = new JLabel();
	JLabel slot3 = new JLabel();
	JButton button = new JButton("spin!");
	private int buttonCount = 0;

	public void run() {
		slot3.setIcon(createLabelImage("pear_PNG.png"));
		slot2.setIcon(createLabelImage("pear_PNG.png"));
		slot1.setIcon(createLabelImage("pear_PNG.png"));
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		panel.add(button);
		button.addActionListener(this);
		frame.pack();
		

	}

	private Icon createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return null;
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return icon;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random r = new Random();
		int ran = r.nextInt(3);
		int ra = r.nextInt(3);
		int rn = r.nextInt(3);
		if (ran == 0) {
			System.out.println("0");
			slot1.setIcon(createLabelImage("cherry_PNG.png"));
		} else if (ran == 1) {
			System.out.println("1");
			slot1.setIcon(createLabelImage("apple_PNG.png"));
		} else if (ran == 2) {
			System.out.println("2");
			slot1.setIcon(createLabelImage("pear_PNG.png"));
		}
		if (ra == 0) {
			System.out.println("0");
			slot2.setIcon(createLabelImage("cherry_PNG.png"));
		} else if (ra == 1) {
			System.out.println("1");
			slot2.setIcon(createLabelImage("apple_PNG.png"));
		} else if (ra == 2) {
			System.out.println("2");
			slot2.setIcon(createLabelImage("pear_PNG.png"));
		}
		if (rn == 0) {
			System.out.println("0");
			slot3.setIcon(createLabelImage("cherry_PNG.png"));
		} else if (rn == 1) {
			System.out.println("1");
			slot3.setIcon(createLabelImage("apple_PNG.png"));
		} else if (rn == 2) {
			System.out.println("2");
			slot3.setIcon(createLabelImage("pear_PNG.png"));
		}
		frame.pack();
		frame.repaint();
		if(ran==rn&&ran==ra) {
			JOptionPane.showMessageDialog(null, "big win!!!\nu win 10,000!");
		}
	}

}
