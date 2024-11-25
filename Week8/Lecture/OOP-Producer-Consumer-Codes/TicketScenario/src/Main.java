public class Main {
    public static void main(String[] args) {
        // Creating the shared ticket pool
        TicketPool ticketPool = new TicketPool(10);

        // Creating the vendor thread
        Vendor vendor = new Vendor(ticketPool);
        Thread threadVendor = new Thread(vendor, "Vendor Thread");

        // Creating the customer thread
        Customer customer = new Customer(ticketPool);
        Thread threadCustomer = new Thread(customer, "Customer Thread");

        // Starting both the threads
        threadVendor.start();
        threadCustomer.start();
    }
}
