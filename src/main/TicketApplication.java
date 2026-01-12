package main;

import service.TicketService;
import util.InputValidator;

import java.util.Scanner;

public class TicketApplication {

    public static void main(String[] args) {

        TicketService service = new TicketService();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Customer Support Ticket System ---");
            System.out.println("1. Create Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Update Ticket Status");
            System.out.println("4. Close Ticket");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Customer Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Issue Description: ");
                    String issue = scanner.nextLine();

                    System.out.print("Priority (HIGH/MEDIUM/LOW): ");
                    String priority = scanner.nextLine();

                    if (!InputValidator.isValidPriority(priority)) {
                        System.out.println("Invalid priority.");
                        break;
                    }

                    service.createTicket(name, issue, priority.toUpperCase());
                    break;

                case 2:
                    service.viewTickets();
                    break;

                case 3:
                    System.out.print("Enter Ticket ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("New Status: ");
                    String status = scanner.nextLine();

                    service.updateTicketStatus(updateId, status.toUpperCase());
                    break;

                case 4:
                    System.out.print("Enter Ticket ID: ");
                    int closeId = scanner.nextInt();
                    service.closeTicket(closeId);
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
