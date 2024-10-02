package lk.sanu.oop.week01;

import java.util.Scanner;

public class Circle {
    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius: "); // This is a Label. Will be visible to use while getting input
        double radius = input.nextDouble();
        double area = getArea(radius);
        double circumference = getCircumference(radius);
        System.out.println("Area is " + area);
        System.out.println("Circumference is " + circumference);
    }
}
