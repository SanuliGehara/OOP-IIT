public class Circle {
    private double radius;
    private String color;

    // Constructors to initialize circle objects
    public Circle() {
        this.radius = 0.0;
        this.color = "";
    }

    public Circle(double r) {
        radius = r;
    }

    public Circle(double r, String color) {
        this.radius = r;
        this.color = color;
    }

    // Getters and Setters
    public double getRadius() {
        return radius;
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

    // Calculate and get the area
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle { Radius = " + radius + ", Color = " + color +", Area = " + getArea() + " }";
    }
}
