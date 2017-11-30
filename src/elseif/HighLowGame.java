//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		Random  r = new Random();
	int y =	r.nextInt(100) + 1;
		// 2. Print out the random variable above
	//	System.out.println(y);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String n = JOptionPane.showInputDialog("Guess a number from 1-100.");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int x = Integer.parseInt(n);
			// 5. if the guess is correct
			if (y>x-1&&y<x+1) {
				JOptionPane.showMessageDialog(null, "You are correct!");
			
				// 6. win
				JOptionPane.showMessageDialog(null, "You win! CONGRATULATIONS!");
			}
			// 7. if the guess is high
			if (x>y) {
				JOptionPane.showMessageDialog(null, "Your guess is too high");
			
				// 8. tell them it's too high
				}
			if (x<y) {
			JOptionPane.showMessageDialog(null,"Your guess is too low" );	
			
			// 9. if the guess is low
				// 10. tell them it's too low
}
		// 12. tell them they lose
	}		
			JOptionPane.showMessageDialog(null,"You lose! :(");
	

}}


