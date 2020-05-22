package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator {
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
		panel.add(text);
		panel.add(text1);
		frame.add(panel1);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button);
		frame.setSize(200,200);
		frame.pack();
		frame.setVisible(true);
		JOptionPane.showMessageDialog(null, answer);
	}

	void add() {
		answer = number1 + number2;
	}

	void sub() {
		answer = number1 - number2;
	}

	void div() {
		answer = number1 / number2;
	}

	void mul() {
		answer = number1 * number2;
	}
}
