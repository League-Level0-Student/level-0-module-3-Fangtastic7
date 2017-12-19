import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class Obedient_Robot {
public static void main(String[] args) {
	for (int i = 0; i < 3; i++) {
String shape = JOptionPane.showInputDialog("What shape do you want?");


	

if(shape.equalsIgnoreCase("Square")) {
	drawSquare();
}
else if (shape.equalsIgnoreCase("Triangle")) {
	drawTriangle();
}
else if (shape.equalsIgnoreCase("Circle")) {
	drawCircle();
}
}
}

private static void drawSquare() {
Robot rob = new Robot();
String color = JOptionPane.showInputDialog("What color do you want?");
if(color.equalsIgnoreCase("red")) {
	rob.setPenColor(255,0,0);
}
else if(color.equalsIgnoreCase("green")) {
	rob.setPenColor(0,255,0);
}
else if(color.equalsIgnoreCase("blue")) {
	rob.setPenColor(0,0,255);
}
rob.setSpeed(98233752);
rob.moveTo(120, 100);
rob.penDown();
for (int i = 0; i < 4; i++) {
		rob.move(50);
		rob.turn(90);
	}
rob.hide();
}
private static void drawTriangle() {
Robot rob = new Robot();
String color = JOptionPane.showInputDialog("What color do you want?");
if(color.equalsIgnoreCase("red")) {
	rob.setPenColor(255,0,0);
}
else if(color.equalsIgnoreCase("green")) {
	rob.setPenColor(0,255,0);
}
else if(color.equalsIgnoreCase("blue")) {
	rob.setPenColor(0,0,255);
}
rob.setSpeed(82750206);
rob.moveTo(200, 100);
rob.penDown();
for (int i = 0; i < 3; i++) {
	
	rob.move(50);
	rob.turn(120);
}
rob.hide();
}
private static void drawCircle() {
Robot rob = new Robot();
String color = JOptionPane.showInputDialog("What color do you want?");
if(color.equalsIgnoreCase("red")) {
	rob.setPenColor(255,0,0);
}
else if(color.equalsIgnoreCase("green")) {
	rob.setPenColor(0,255,0);
}
else if(color.equalsIgnoreCase("blue")) {
	rob.setPenColor(0,0,255);
}
rob.setSpeed(17979);
rob.moveTo(0, 100);
for (int i = 0; i < 36; i++) {
	rob.penDown();
	rob.move(10);
	rob.turn(10);
	
}
	rob.hide();
}
}

