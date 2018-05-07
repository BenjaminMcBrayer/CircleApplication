//Benjamin McBrayer, 5.6.2018

package com.circle.gc;

public class Circle {
	
private double radius;

public Circle(double radius) {
		super();
		this.radius = radius;
	}

public double getCircumference() {
	return 2 * Math.PI * radius;
}

public String getFormattedCircumference() {
	return "Circumference: " + formatNumber(getCircumference());
}

public double getArea() {
	return Math.PI * radius * radius;
}

public String getFormattedArea() {
	return "Area: " + formatNumber(getArea());
}

private String formatNumber(double x) {
	return String.format("%.2f", x);
}
}
