package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nasty_suprise implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button1=new JButton("treat");
	JButton button2=new JButton("trick");
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==button1) {
		showPictureFromTheInternet("https://townsquare.media/site/158/files/2014/01/tolilet-paper-prank-credit-istock-139986228.jpg?w=980&q=75");
	}else {
		showPictureFromTheInternet("https://upload.wikimedia.org/wikipedia/commons/0/02/Tootsie-Roll-WU.jpg");
	}
	
}
public void run() {
	frame.setVisible(true);
	panel.add(button1);
	panel.add(button2);
	frame.add(panel);
	button1.addActionListener(this);
	button2.addActionListener(this);
	
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
}
