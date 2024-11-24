public class Shape {
    private double x;
    private double y;

    //Constructors
    public Shape() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString () {
        return "Shape \tx=" + x + ", \ty=" + y;
    }
}
