
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Robot;
import java.security.PermissionCollection;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot robot = new Robot();
		Random r = new Random();
		//3. ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color do you want the robot to draw?");
		//4. use an if/else statement to set the pen color that the user requested
		if(color.equalsIgnoreCase(color)) {
			 robot.setPenColor(color);
		}
        //5. if the user doesn’t enter anything, choose a random color
		else {
			
		}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		robot.setPenWidth = 10;
	    //1. make the robot draw a shape (this will take more than one line of code)
		robot.
	}
}
