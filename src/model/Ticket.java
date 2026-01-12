package model;

public class Ticket {

    private int ticketId;
    private String customerName;
    private String issueDescription;
    private String priority;
    private String status;

    public Ticket(int ticketId, String customerName, String issueDescription, String priority) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.issueDescription = issueDescription;
        this.priority = priority;
        this.status = "OPEN";
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId +
                ", Customer: " + customerName +
                ", Issue: " + issueDescription +
                ", Priority: " + priority +
                ", Status: " + status;
    }
}
