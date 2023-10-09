public class Ticket {
    private int id =0;
    private boolean vip = false;
    private float price = 0;
    private boolean available;
    private Event event;

    public Ticket(int id, boolean vip, float price) {
        this.id = id;
        this.vip = vip;
        this.price = price;
        this.available = true;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public boolean isVip() {
        return vip;
    }

    public float getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public Event getEvent() {
        return event;
    }
}
