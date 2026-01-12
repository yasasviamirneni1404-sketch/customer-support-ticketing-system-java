package service;

import model.Ticket;
import java.util.ArrayList;
import java.util.List;

public class TicketService {

    private List<Ticket> tickets = new ArrayList<>();
    private int ticketCounter = 1;

    public void createTicket(String customerName, String issue, String priority) {
        Ticket ticket = new Ticket(ticketCounter++, customerName, issue, priority);
        tickets.add(ticket);
        System.out.println("Ticket created successfully.");
    }

    public void viewTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets available.");
            return;
        }

        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    public void updateTicketStatus(int ticketId, String status) {
        for (Ticket ticket : tickets) {
            if (ticket.getTicketId() == ticketId) {
                ticket.setStatus(status);
                System.out.println("Ticket status updated.");
                return;
            }
        }
        System.out.println("Ticket not found.");
    }

    public void closeTicket(int ticketId) {
        updateTicketStatus(ticketId, "CLOSED");
    }
}
