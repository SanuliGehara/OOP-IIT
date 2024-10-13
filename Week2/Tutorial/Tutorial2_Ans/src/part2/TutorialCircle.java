package part2;

public class TutorialCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle 1, color is " + circle1.getColor() +" and has radius of "+ circle1.getRadius() +
                " and area of "  + circle1.getArea());

        Circle circle2 = new Circle(8);
        System.out.println("The circle 2 color is "+ circle2.getColor()+" and has radius of "+ circle2.getRadius() +
                " and area of "  + circle2.getArea());

        Circle circle3 = new Circle(7, "Red");
        System.out.println("The circle 3, color is " + circle3.getColor()+ " and has radius of "+ circle3.getRadius() +
                " and area of "  + circle3.getArea());

        circle2.setColor("Black");
        circle2.setRadius(10);
        System.out.println("The circle 2 color is "+ circle2.getColor()+" and has radius of "+ circle2.getRadius() +
                " and area of "  + circle2.getArea());

        Circle circle4 = new Circle(22, "White");
        System.out.println(circle4);


    }
}
