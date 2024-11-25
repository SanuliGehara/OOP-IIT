public class Mother implements Runnable{
    private Plate plate;

    public Mother(Plate plate) {
        this.plate = plate;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            plate.serveFood("Food : " + i);
//            System.out.println(Thread.currentThread().getName() + " : " + "Food : " + i);
        }
    }
}
