import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotMAchine implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JPanel panel1=new JPanel();
	JLabel slot=new JLabel();
	JLabel slot2=new JLabel();
	JLabel slot3=new JLabel();
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
}
@Override
public void actionPerformed(ActionEvent e) {
	Random r=new Random();
	int ran=r.nextInt(3);
	if(ran==0) {
		System.out.println("0");
	}else if(ran==1) {
		System.out.println("1");
	}else if(ran==2) {
		System.out.println("2");
	}
 	
}
}
