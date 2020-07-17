package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class whackAMole implements ActionListener {
	String mole="mole";

	JFrame frame = new JFrame("click or bring shame to your family");
	JButton button=new JButton("start");
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button10 = new JButton();
	JButton button11 = new JButton();
	JButton button12 = new JButton();
	JButton button13 = new JButton();
	JButton button14 = new JButton();
	JButton button15 = new JButton();
	JButton button16 = new JButton();
	JPanel panel=new JPanel();
	JLabel label=new JLabel("mole");

	public void run() {
		label.setText("MOLE");
		//stuff
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		button16.addActionListener(this);
		//stuff
		frame.setVisible(true);
		frame.setSize(300,500);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		panel.add(button);
		frame.add(panel);
		
	}
void pickMole() {
	Random ran=new Random();
	int random=ran.nextInt(16);
	if(random==0) {
		button1.setText("mole");
	}else if(random==1) {
		button2.setText("mole");
	}else if(random==2) {
		button3.setText("mole");
	}else if(random==3) {
		button4.setText("mole");
	}else if(random==4) {
		button5.setText("mole");
	}else if(random==5) {
		button6.setText("mole");
	}else if(random==6) {
		button7.setText("mole");
	}else if(random==7) {
		button8.setText("mole");
	}else if(random==8) {
		button9.setText("mole");
	}else if(random==10) {
		button11.setText("mole");
	}else if(random==11) {
		button12.setText("mole");
	}else if(random==12) {
		button13.setText("mole");
	}else if(random==13) {
		button14.setText("mole");
	}else if(random==14) {
		button15.setText("mole");
	}else if(random==15) {
		button16.setText("mole");
	}

}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==button) {
		button1.setText("mole");
			System.out.println("started");
			
		}
		if(buttonPressed.getText().equals("mole")) {
			button1.setText("");
			buttonPressed.setText("");
			//frame.add(panel);
			//frame.pack();
			//run();
			frame.dispose();
			run();
			pickMole();
			
		}
		
	}
	
}
