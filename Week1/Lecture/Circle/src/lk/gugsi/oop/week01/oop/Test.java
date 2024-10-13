package lk.gugsi.oop.week01.oop;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Radius : "); // that is a label will be displayed to the user while getting input
		double radius = input.nextDouble();
		Circle obj = new Circle(radius);
		System.out.println("Area "+obj.getArea());
		
		System.out.print("Enter the New Radius : "); // that is a label will be displayed to the user while getting input
		double newRadius = input.nextDouble();
		obj.setRadius(newRadius);
		System.out.println("Area "+obj.getArea());

	}

}
