public class Customer implements Runnable {
    private TicketPool ticketPool;

    public Customer(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            String ticket = ticketPool.retrieveTicket();
        }
    }
}
