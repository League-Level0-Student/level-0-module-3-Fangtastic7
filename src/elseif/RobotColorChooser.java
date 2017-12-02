
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.security.PermissionCollection;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot robot = new Robot();
		for (int i = 0; i < 7; i++) {
			
		
		//3. ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color do you want the robot to draw?");
		//4. use an if/else statement to set the pen color that the user requested
		if(color.equalsIgnoreCase("red")) {
			 robot.setPenColor(255,0,0);
		}
		else if (color.equalsIgnoreCase("orange")) {
			robot.setPenColor(255,165,0);
		}
		else if (color.equalsIgnoreCase("yellow")) {
			robot.setPenColor(0, 255,255);
		}
		else if (color.equalsIgnoreCase("green")) {
			robot.setPenColor(0,255,0);
		}
		else if (color.equalsIgnoreCase("blue")){
				robot.setPenColor(0,0,255);
	}
        //5. if the user doesn’t enter anything, choose a random color
		else {
			robot.setRandomPenColor();
		}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		robot.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
		robot.penDown();
		robot.setSpeed(10);
		for (int t = 0; t < 4; t++) {
			robot.move(200);
			robot.turn(90);
		}
		}
	}
}
