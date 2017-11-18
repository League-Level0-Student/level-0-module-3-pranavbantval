
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
Robot r = new Robot();
r.penDown();
for (int b = 0; b < 3; b++) {
	

		//3. ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw? Blue, red, green, or random?");
		//4. use an if/else statement to set the pen color that the user requested
if (color.equalsIgnoreCase("Blue")) {
	r.setPenColor(0,0,255);
}	
else if (color.equalsIgnoreCase("Green")) {
	r.setPenColor(0,255,0);
}
else if (color.equalsIgnoreCase("red")) {
	r.setPenColor(255,0,0);
}
        //5. if the user doesn’t enter anything, choose a random color
else {
	r.setRandomPenColor();
}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		r.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
for (int i = 0; i < 360; i++) {
	r.setSpeed(50);

r.move(2);
r.turn(1);
	}}
}
}
