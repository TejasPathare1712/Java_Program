import java.util.*;

class Ticket {
    private int ticketId;
    private String customerName;
    private String showName;

    public Ticket(int ticketId, String customerName, String showName) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.showName = showName;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getShowName() {
        return showName;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + ", Customer Name: " + customerName + ", Show Name: " + showName;
    }
}

public class TicketBookingSystem {
    private static Map<Integer, Ticket> ticketDatabase = new HashMap<>();
    private static int nextTicketId = 1; // Auto-increment ticket ID

    public static void bookTicket(String customerName, String showName) {
        Ticket ticket = new Ticket(nextTicketId, customerName, showName);
        ticketDatabase.put(nextTicketId, ticket);
        System.out.println("Ticket booked successfully! Ticket ID: " + nextTicketId);
        nextTicketId++;
    }

    public static void cancelTicket(int ticketId) {
        if (ticketDatabase.containsKey(ticketId)) {
            ticketDatabase.remove(ticketId);
            System.out.println("Ticket with ID " + ticketId + " has been canceled.");
        } else {
            System.out.println("No ticket found with ID: " + ticketId);
        }
    }

    public static void viewTickets() {
        if (ticketDatabase.isEmpty()) {
            System.out.println("No tickets booked.");
        } else {
            System.out.println("List of Booked Tickets:");
            for (Ticket ticket : ticketDatabase.values()) {
                System.out.println(ticket);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Ticket Booking System ===");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter Show Name: ");
                    String showName = scanner.nextLine();
                    bookTicket(customerName, showName);
                    break;

                case 2:
                    System.out.print("Enter Ticket ID to cancel: ");
                    int ticketId = scanner.nextInt();
                    cancelTicket(ticketId);
                    break;

                case 3:
                    viewTickets();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
