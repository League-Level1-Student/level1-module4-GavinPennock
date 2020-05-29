package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	int answer;
	int number1;
	int number2;
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JTextField text = new JTextField(5);
	JTextField text1 = new JTextField(5);
	JPanel panel = new JPanel();
	JButton button = new JButton("add");
	JButton button1 = new JButton("sub");
	JButton button2 = new JButton("mul");
	JButton button3 = new JButton("div");

	public void run() {
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		panel.add(text);
		panel.add(text1);
		frame.add(panel1);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button);
		frame.setSize(200, 200);
		frame.pack();
		frame.setVisible(true);
		
	}

	void add() {
		number1=Integer.parseInt(text.getText());
		answer =number1 + number2;
	}

	void sub() {
		number1=Integer.parseInt(text.getText());
		answer = number1 - number2;
	}

	void div() {
		answer = number1 / number2;
	}

	void mul() {
		answer = number1 * number2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		number1=Integer.parseInt(text.getText());
		number2=Integer.parseInt(text1.getText());
		System.out.println(number2+" "+number1);
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button) {
			add();
			JOptionPane.showMessageDialog(null, answer);
		} else if (buttonPressed == button1) {
			sub();
			JOptionPane.showMessageDialog(null, answer);
		} else if (buttonPressed == button2) {
			mul();
			JOptionPane.showMessageDialog(null, answer);
		} else if (buttonPressed == button3) {
			div();
			JOptionPane.showMessageDialog(null, answer);
		}
	}
}
