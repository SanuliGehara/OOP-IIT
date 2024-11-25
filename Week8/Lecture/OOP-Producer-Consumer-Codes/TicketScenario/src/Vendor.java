public class Vendor implements Runnable {
    private TicketPool ticketPool;

    public Vendor(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            ticketPool.addTicket("Ticket " + i);
        }
    }
}
