//Benjamin McBrayer, 5.6.2018
//This Java console program calculates a circle's circumference and area.

package com.circle.gc;
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double radius = 0;
		int numCircles = 0;
		String playAgain;
		
		System.out.println("Welcome to the Grand Circus Circle Generator!");
		
		do {
			//Prompt the user to enter a radius.
			radius = Validator.getDouble(scnr, "Please enter the radius: ", 0, Double.MAX_VALUE);
			
			// Create a Circle object.
			Circle c = new Circle(radius);
			
			//Display circumference.
			System.out.println(c.getFormattedCircumference());
			
			//Display area.
			System.out.println(c.getFormattedArea());
			
			//FIXME: Create a method that counts the number of circles the user generates.
			++numCircles;
			
			//Prompt user to continue.
			playAgain = Validator.getString(scnr, "Continue? (y/n)");
			
		} while (playAgain.equalsIgnoreCase("y"));

		
		//FIXME: Also indicate the number of circles the user generated.
		if (numCircles == 1 ) {
			System.out.println("You have generated " + numCircles + " circle.");
		} else { 
			System.out.println("You have generated " + numCircles + " circles.");
		}
		System.out.println("Goodbye.");
		
		scnr.close();
	}

}
