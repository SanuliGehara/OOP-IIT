package part2;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1;
        this.color = "Blue";
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "Blue";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // method to get radius
    public double getRadius() {
        return this.radius;
    }

    // method to calculate area
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    // override toString() method
    @Override
    public String toString() {
        return "From toString() method:\t The circle color is "+ this.getColor()+" and has radius of "+ this.getRadius() +
                " and area of "  + this.getArea();
    }
}
