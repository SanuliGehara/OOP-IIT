package lk.sanu.oop;

import org.w3c.dom.css.Rect;

public class Rectangle {
    public  double width;
    public double length;
    private static int numOfRectangles;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
        numOfRectangles++;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public static int getNumOfRectangles() {
        return numOfRectangles;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    // compare 2 objects
//    1. compareRectangle()
//   2. compareTo() method -> override
//  0 = equals, 1 = current is bigger & param is smaller, -1 = current smaller
}
