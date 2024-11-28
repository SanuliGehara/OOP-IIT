import java.math.BigDecimal;

public class Vendor implements Runnable{
    private TicketPool ticketPool;
    private int totalTickets;  //total ticket that the vendor will sell/available
    private int ticketReleaseRate; //frequency in which tickets will be added to the pool / delay(time)

    public Vendor(TicketPool ticketPool, int totalTickets, int ticketReleaseRate) {
        this.ticketPool = ticketPool;
        this.totalTickets = totalTickets;
        this.ticketReleaseRate = ticketReleaseRate;
    }

    @Override
    public void run() {
        for (int i=1; i<=totalTickets; i++) {
            // creates a new ticket
            Ticket ticket = new Ticket(i, "Spandana", new BigDecimal("1000"));
            ticketPool.addTicket(ticket); //method to add tickets in the ticket pool

            //The ticket release frequency means delay
            // We should convert the value in S to Ms
            try {
                Thread.sleep(ticketReleaseRate * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}
