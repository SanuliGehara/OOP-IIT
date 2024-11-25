public class Plate {
    private String food;
    private boolean foodAvailability = false;

    public synchronized void serveFood(String food){
        while (foodAvailability){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " : " + "Food : " + food);
        this.food = food;
        this.foodAvailability = true;
        notifyAll();
    }

    public synchronized String consumeFood(){
        while (!foodAvailability){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " : " + " Food Consumed : " + food);
        this.foodAvailability = false;
        notifyAll();
        return food;
    }
}
