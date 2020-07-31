package mph;

import javax.swing.JOptionPane;

public class mphCalculator {
	
	
	public static void main(String[] args) {
		String d=JOptionPane.showInputDialog("enter wheel circumference(round to the ones)");
		int C=Integer.parseInt(d);
		String r=JOptionPane.showInputDialog("enter rpm");
		int rpm=Integer.parseInt(r);
		int inm=(rpm*C);
		System.out.println(inm);
		int fpm=(inm/12);
		System.out.println(fpm);
		int fph=(fpm*60);
		System.out.println(fph);
		int mph=(fph/5280);
		int fps=(fpm/60);
		JOptionPane.showMessageDialog(null, "your fps is about "+fps+"\nyour mph is about "+mph);
	}

	
	
}

