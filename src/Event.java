import java.time.LocalDate;
import java.util.ArrayList;

public class Event {
    private String name = "";
    private final LocalDate date;
    private final ArrayList<Ticket> ticketList = new ArrayList<>();
    private final ArrayList<Ticket> ticketVipList = new ArrayList<>();
    private final ArrayList<Seat> seats = new ArrayList<>();
    private int ticketAmount;
    private double percentOfVip;
    private boolean areSeats;
    private int minAge;


    public Event(String name, String date, int ticketAmount, double percentOfVip, float price, float vipPrice, boolean areSeats, int minAge) {
        this.name = name;
        this.date = LocalDate.parse(date);
        this.ticketAmount = ticketAmount;
        this.percentOfVip = percentOfVip;
        this.minAge = minAge;

        for(int i=0; i<=ticketAmount*(1-percentOfVip)-1; i++){ //Inserting regular tickets to ticketList
            Ticket ticket = new Ticket(i, false, price);
            ticket.setEvent(this);
            ticketList.add(ticket);
        }
        for(int i=0; i<=(int)ticketAmount*percentOfVip-1; i++){ //Inserting VIP tickets to ticketList
            Ticket ticketVip = new Ticket(i, true, vipPrice);
            ticketVip.setEvent(this);
            ticketVipList.add(ticketVip);
        }
        if(areSeats) {
            for (int i = 0; i < ticketList.size(); i++) {
                Seat seat = new Seat();
                seat.setTicket(ticketList.get(i));
                seats.add(seat);
            }
            for (int i = 0; i < getTicketVipList().size(); i++) {
                Seat seat = new Seat();
                seat.setTicket(ticketVipList.get(i));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    public ArrayList<Ticket> getTicketVipList() {
        return ticketVipList;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public int getMinAge() {
        return minAge;
    }
}

