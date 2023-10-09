public class Seat {
    private boolean available;
    private Ticket ticket;

    public Seat() {
        this.available = true;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
