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
import javax.swing.JPanel;

public class slotMAchine implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JPanel panel1=new JPanel();
	JPanel slot1=new JPanel();
	JPanel slot2=new JPanel();
	JPanel slot3=new JPanel();
	JButton button=new JButton("spin!");
	private int buttonCount = 0;
public void run() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(slot);
	panel.add(slot2);
	panel.add(slot3);
	panel1.add(button);
	
	buttonCount++;
	frame.add(panel1);
	button.addActionListener(this);
	frame.setSize(500,500);
	frame.pack();
	
		
	}
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}

@Override
public void actionPerformed(ActionEvent e) {
	Random r=new Random();
	int ran=r.nextInt(3);
	int ra=r.nextInt(3);
	int rn=r.nextInt(3);
	if(ran==0) {
		System.out.println("0");
		
	}else if(ran==1) {
		System.out.println("1");
	}else if(ran==2) {
		System.out.println("2");
	}
 	if(ran==0) {
 		slot1.createLabelImage("apple_PNG.png");
 	}
}

}
