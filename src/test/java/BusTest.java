import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {

    Bus bus;
    Bus bus2;
    Passenger passenger;
    BusStop busStop;


    @Before
    public void before() {
        bus = new Bus("London", 40);
        passenger = new Passenger();
        busStop = new BusStop("Edinburgh");
    }
    @Test
    public void canAddPassenger() {
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }
    @Test
    public void canAddIfCapacityAllows() {
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
        assertEquals(39, bus.capacityCount());

    }
    @Test
    public void cannotAddPassenger() {
        bus2 = new Bus("Edinburgh", 1);

        bus2.addPassenger(passenger);
        bus2.addPassenger(passenger);
        assertEquals(0, bus2.capacityCount());
        assertEquals(1, bus2.passengerCount());
    }
    @Test
    public void canRemovePassenger() {
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
        assertEquals(39, bus.capacityCount());
    }

    @Test

    public void canPickUpPassengersFromBusStop() {
        busStop.addPassenger(passenger);
        busStop.addPassenger(passenger);
        Passenger newPerson = busStop.removePassenger();
        bus.addPassenger(newPerson);
        assertEquals(1, busStop.queueCount());
    }
}
