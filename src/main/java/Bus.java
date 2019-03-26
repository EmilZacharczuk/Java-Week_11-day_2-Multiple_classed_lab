import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengers;


    public Bus (String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public int capacityCount() {
        return this.capacity;
    }

    public void addPassenger(Passenger passenger) {
        if (this.capacity > this.passengers.size()){
            this.passengers.add(passenger);
            this.capacity -= 1;
        }
    }

    public void removePassenger() {
        if (this.passengers.size() > 0) {
            this.passengers.remove(0);
            this.capacity += 1;
        }

    }


}
