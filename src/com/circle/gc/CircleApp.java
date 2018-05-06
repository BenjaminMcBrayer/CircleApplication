//Benjamin McBrayer, 5.6.2018
//This Java console program calculates a circle's circumference and area.

package com.circle.gc;
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double radius = 0;
		String playAgain;
		
		System.out.println("Welcome to the Grand Circus Circle Tester!");
		
		do {
			//Prompt the user to enter a radius.
			radius = Validator.getDouble(scnr, "Please enter the radius: ", 0, Double.MAX_VALUE);
			
			// Create a Circle object.
			Circle c = new Circle(radius);
			
			//Display circumference.
			System.out.println(c.getFormattedCircumference());
			
			//Display area.
			System.out.println(c.getFormattedArea());
			
			//Prompt user to continue.
			playAgain = Validator.getString(scnr, "Continue? (y/n)");
			
		} while (playAgain.equalsIgnoreCase("y"));

		System.out.println("Goodbye.");
		
		scnr.close();
	}

}
