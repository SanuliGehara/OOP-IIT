import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        Thread producer = new Thread(new Producer(), "Producer");
        Thread consumer = new Thread(new Consumer(), "Consumer");
    }
}