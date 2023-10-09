import java.util.ArrayList;

public class Client {
    private String name = "";
    private String lastName = "";
    private int age;
    private final ArrayList<Ticket> reservedTickets = new ArrayList<>();
    private final ArrayList<Ticket> deletedTickets = new ArrayList<>();

    public Client(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public void addTicket(Ticket ticket){
        reservedTickets.add(ticket);
    }
    public void deleteTicket(Ticket ticket){
        reservedTickets.remove(ticket);
        deletedTickets.add(ticket);
    }
}
