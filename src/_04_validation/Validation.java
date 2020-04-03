//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[]args) {
		
		Random randomMaker = new Random();
		
		for (int i = 0; i < 10; i++) {
			
		
		int randomNumber = randomMaker.nextInt(5);

		// 1. Use each value of randomNumber to give the user a random compliment.
		Random ran = new Random();
		int compliment = ran.nextInt(5);
		
		if (compliment==0) {
			JOptionPane.showMessageDialog(null, "I like your hair!");
		}		 if(compliment == 1) {
				JOptionPane.showMessageDialog(null,"You look really pretty today!");
				
			
	}		 if(compliment == 2) { 
		JOptionPane.showMessageDialog(null,"You're very smart!");
			if(compliment== 3) {
				JOptionPane.showMessageDialog(null,"I like your nails today!");

			}
			if (compliment==4) {
				JOptionPane.showMessageDialog(null,"Your looking better than ever!");
			if(compliment==5) {
				JOptionPane.showMessageDialog(null,"I like the outfit today!");
			}

			}

	}	
				
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
