
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
			String birthday = JOptionPane.showInputDialog("Who's birthday do you want to know?");
		// 3. Print out what the user typed
			System.out.println(birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
			if(birthday.equalsIgnoreCase("mom")){
			System.out.println("February 13");
			}
		// 5. if user asked for "dad"
			// print dad's birthday
			else if(birthday.equalsIgnoreCase("dad")) {
				System.out.println("June 16");
			}
		// 6. if user asked for your name
			// print myBirthday
			else if(birthday.equalsIgnoreCase("yours")) {
				System.out.println("December 25");
			}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			else {
				System.out.println("Sorry, I don't remember that person's birthday!");
			}
	} 
}
