public class Cylinder extends Circle{
    private double height;

    // Constructors
    public Cylinder() {
        super();
        this.height = 0.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getters and Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate and get the volume of the cylinder
    public double getVolume() {
        return getArea() * height; // no need to say super.getArea() 
    }
}
