package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String Height = JOptionPane.showInputDialog("What is your height in inches?");
	int Height1 = Integer.parseInt(Height);
	if (Height1 > 48) {
		JOptionPane.showMessageDialog(null,"You can go on the ride alone!");
	}
		if (Height1 > 42 && Height1 < 48) {
			JOptionPane.showMessageDialog(null,"You may go on the ride with an adult");
			
	}
		if (Height1 < 42) {
			JOptionPane.showMessageDialog(null,"GROW MORE!");
		}
}
}
