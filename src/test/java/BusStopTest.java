import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Passenger passenger;
    BusStop busStop;
    Bus bus;

    @Before
    public void before() {
        passenger = new Passenger();
        bus = new Bus("London", 40);
        busStop = new BusStop("Edinburgh");
    }
    @Test
    public void canAddPersonToTheQueue () {
        busStop.addPassenger(passenger);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPassenger(passenger);
        busStop.addPassenger(passenger);
        busStop.removePassenger();
        assertEquals(1, busStop.queueCount());
    }

}
