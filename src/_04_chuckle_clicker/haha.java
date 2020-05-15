package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class haha implements ActionListener {
	JButton button1=new JButton("punchline");
	JButton button=new JButton("joke");
public void run(){
	JFrame frame=new JFrame("chuckle clicker");
	JPanel panel=new JPanel();
	frame.setVisible(true);
	
	panel.add(button);
	
	panel.add(button1);
	frame.add(panel);
	frame.pack();
	button.addActionListener(this);
	button1.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==button) {
		JOptionPane.showMessageDialog(null, "what do you get when you cross a snowman and a vampire?");
	}else {
		JOptionPane.showMessageDialog(null, "frostbite");
	}
}
}
