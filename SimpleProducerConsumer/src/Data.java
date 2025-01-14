// Monitor
// Shared Resource between Threads
public class Data {

    private int data; // shared variables
    private boolean availability;// check for availability

    // method called by the consumer
    public synchronized int getData() {
        while(!availability) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //availability becomes true only this point will get executed
        // i.e data is available for consumption

        availability = false;
        notifyAll(); // all the threads in the waiting state on this particular object is will be notified
        // as a result all the threads will go into RUNNABLE from WAITING state
        return data; // Consuming part
        // nothing can come here because it is unreachable
    }

    // method called by the producer
    public synchronized void putData(int data) {
        while(availability) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // availability is false only this part if the putData() method will execute
        // i.e data is not available for the consumer to consume
        this.data = data; // producing the data part
        availability = true;
        notifyAll(); // informs the consumer to come and consume and data is available
    }
}