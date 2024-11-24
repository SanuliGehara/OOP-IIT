public abstract class TwoDShape extends Shape{
    public TwoDShape() {
        super();
    }

    public TwoDShape(double x, double y) {
        super(x,y);
    }


    public abstract double getPerimeter();

    public abstract double getArea();
}
