import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Passenger> queue;

    public BusStop (String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int queueCount() {
        return this.queue.size();
    }

    public void addPassenger(Passenger passenger) {
        this.queue.add(passenger);
    }

    public Passenger removePassenger() {
        return this.queue.remove(0);
    }
}
