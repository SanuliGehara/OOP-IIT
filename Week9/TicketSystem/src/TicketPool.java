import java.util.LinkedList;
import java.util.Queue;

public class TicketPool {
    private Queue<Ticket> ticketQueue;
    private int maximumCapacity; //maximum tickets that the queue can have at any given time

    public TicketPool(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.ticketQueue = new LinkedList<>();
    }

    /*
    * @desc used by vendor to add tickets to the ticketPool
    * @param Ticket
    * */
    public synchronized void addTicket(Ticket ticket) {
        //check if queue is full
        while(ticketQueue.size() >= maximumCapacity) {
            //wait until space comes
            try {
                wait();  //throws interrupted exception
            } catch (InterruptedException e) {
                // Immediately after the try block, catch or finally block must come
                e.printStackTrace();  //For CLI
                throw new RuntimeException(e.getMessage());
            }
        }
        //queue is not full
        this.ticketQueue.add(ticket); //vendor can add ticket
        notifyAll(); //All the threads waiting on the ticketpool object will be inforemed(basically customers)
        System.out.println(Thread.currentThread().getName() + " has added a ticket to the ticket pool. Current size is " + this.ticketQueue.size()); //shows who added the ticket and current size

    }


    /*
    * Used by customers to buy tickets
    * @return Ticket*/
    public synchronized Ticket buyTicket() {
        //If ticket pool is empty customer will wait
        while (ticketQueue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Ticket ticket = ticketQueue.poll(); //Remove the ticket from the front of the queue
        notifyAll(); //Notifies vendor(s) to add more tickets
        System.out.println(Thread.currentThread().getName() + " has bought a ticket from the pool. Current size is " + this.ticketQueue.size());
        return ticket;
    }
}
