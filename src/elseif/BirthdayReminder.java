
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 21st";
		String dadsBirthday = "April 19th";
		String myBirthday = "November 3rd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bday = JOptionPane.showInputDialog("Do you want to know mom's birthday, dad's birthday, or mine?");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
	if (bday.equalsIgnoreCase("mom")) {
		JOptionPane.showMessageDialog(null, momsBirthday);
	}
			//print mom's birthday
		// 5. if user asked for "dad"
	else if (bday.equalsIgnoreCase("dad")) {
		JOptionPane.showMessageDialog(null, dadsBirthday);
	}
			// print dad's birthday
		// 6. if user asked for your name
	else if (bday.equalsIgnoreCase("mine")) {
		JOptionPane.showMessageDialog(null, myBirthday);
	}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	else {
		JOptionPane.showMessageDialog(null, "Sorry, I don't know that person's birthday.");
	}
	} 
}
