import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TicketPool {
    private List<String> ticketList;
    private int maxCapacity;

    public TicketPool(int maxCapacity) {
        this.ticketList = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public synchronized void addTicket(String ticket){
        while (ticketList.size() >= maxCapacity){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " added the ticket " + ticket);
        ticketList.add(ticket);
        notifyAll();
    }

    public synchronized String retrieveTicket(){
        while (ticketList.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        notifyAll();
        String ticket = ticketList.removeFirst();
        System.out.println(Thread.currentThread().getName() + " retrieved the ticket " + ticket);
        return ticket;
    }
}
