import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	Robot obey = new Robot();
	
public static void main(String[] args) {

	ObedientRobot rob = new ObedientRobot();
rob.basics();

String shape =	JOptionPane.showInputDialog("Do you want to draw a square, triangle, or circle?");
String color = JOptionPane.showInputDialog("What color do you want it to be: red, blue, green, or random?");
if(color.equalsIgnoreCase("red")) {
	rob.colorRed();
}
else if(color.equalsIgnoreCase("green")) {
	rob.colorGreen();
}
else if(color.equalsIgnoreCase("Blue")) {
	rob.colorBlue();
}
else {
	rob.colorRandom();
}
	if(shape.equalsIgnoreCase("square")){
rob.drawSquare();
	}
	else if(shape.equalsIgnoreCase("Triangle")) {
		rob.drawTriangle();
	}
	else if(shape.equalsIgnoreCase("Circle")) {
		rob.drawCircle();
	}
	else {
		JOptionPane.showMessageDialog(null, "I don't know that shape!");
	}
}
void colorRed() {
obey.setPenColor(255, 0, 0);
}
void colorBlue() {
	obey.setPenColor(0,0, 255);
}
void colorGreen() {
	obey.setPenColor(0,255,0);
}
void colorRandom() {
	obey.setRandomPenColor();
}
void basics() {
	obey.penDown();
	obey.setSpeed(50);
}
void drawTriangle() {
	obey.setAngle(270);
	for (int i = 0; i < 3; i++) {
		
	
	obey.move(100);
	obey.turn(120);}
	obey.hide();
}
void drawSquare() {
for (int i = 0; i < 4; i++) {
	obey.move(100);
obey.turn(90);}
obey.hide();

}
void drawCircle() {
obey.setSpeed(100);	
for (int i = 0; i < 360; i++) {
	obey.move(2);
	obey.turn(1);
}
obey.hide();
}

}

