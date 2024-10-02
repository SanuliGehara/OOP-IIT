package lk.sanu.oop.week01.oop;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(21);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.println("Area is " + Math.round(area)); // rounding the value (1384 to 1385)
        System.out.println("Circumference is " + circumference);
    }
}
