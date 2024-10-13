package lk.gugsi.oop.week01;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Radius : "); // that is a label will be displayed to the user while getting input
		double radius = input.nextDouble();
		double area = getArea(radius);
		double cirF = getCircumference(radius);
		System.out.println("The area is "+area);
		System.out.println("The Circumference is "+cirF);
	}
	
	public static double getArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	public static double getCircumference(double radius) {
		return 2 * Math.PI * radius;
	}

}
