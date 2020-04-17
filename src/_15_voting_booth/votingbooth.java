package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
	String Age = JOptionPane.showInputDialog("How old are you?");
	int Age1 = Integer.parseInt(Age);
	if (Age1 >= 18) {
		JOptionPane.showInputDialog(null, "Who do you think the next president will be?");
		
	}
		else
		JOptionPane.showMessageDialog(null,"Nobody cares what you think");
	
	}
}

