package com.circle.gc;
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double radius = 0;
		String playAgain;
		
		System.out.println("Welcome to the Grand Circus Circle Tester!");
		
		do {
			radius = Validator.getDouble(scnr, "Please enter the radius: ", 0, Double.MAX_VALUE);
			
			Circle c = new Circle(radius);
			
			System.out.println(c.getFormattedCircumference());
			
			System.out.println(c.getFormattedArea());
			
			playAgain = Validator.getString(scnr, "Continue? (y/n)");
			
		} while (playAgain.equalsIgnoreCase("y"));

		System.out.println("Goodbye.");
		
		scnr.close();
	}

}
