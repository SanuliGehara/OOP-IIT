public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate();

        Mother mother = new Mother(plate);
        Thread motherThread = new Thread(mother, "Thread Mother");

        Child child = new Child(plate);
        Thread childThread = new Thread(child, "Thread Child");

        motherThread.start();
        childThread.start();
    }
}