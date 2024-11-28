public class Customer implements Runnable{
    private TicketPool ticketPool;
    private int customerRetrievalRate; //frequency which the tickets will be removed
    private int quantity; //quantity customer willing to purchase

    public Customer(TicketPool ticketPool, int customerRetrievalRate, int quantity) {
        this.ticketPool = ticketPool;
        this.customerRetrievalRate = customerRetrievalRate;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        for (int i=1; i<=quantity; i++) {
            //Buys ticket
            Ticket ticket = ticketPool.buyTicket(); //remove ticket from the ticket pool
            System.out.println("Ticket bought by " + Thread.currentThread().getName() + " , Ticket is "+ ticket);

            //Delay which the tickets will be removed
            try {
                Thread.sleep(customerRetrievalRate*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}
