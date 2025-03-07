package interview;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SkyScannerInterviewTest {
    private SkyScannerInterview subject;

    @BeforeEach
    void setUp() {
        subject = new SkyScannerInterview();
    }

    @AfterEach
    void tearDown() {
        subject = null;
    }

    @Test
    void Test_getConnectingFlights_for_result() {
        List<SkyScannerInterview.Flight> data = new ArrayList<>();
        data.add(new FlightModel("EDI", "LHR", 123.45));
        data.add(new FlightModel("LHR","BCN", 80.90));
        data.add(new FlightModel("BCN","PRG", 98.4));
        data.add(new FlightModel("EDI","SIN", 300.90));
        data.add(new FlightModel("PRG","HAN", 400.00));
        data.add(new FlightModel("EDI","BOM", 547.50));
        data.add(new FlightModel("EDI","DUB", 47.50));
        data.add(new FlightModel("DUB","EDI", 53.20));
        data.add(new FlightModel("DUB","BCN", 99.50));

        Set<String> actual = subject.getConnectingFlights(data, "EDI", 500);

        Set<String> expected = new HashSet<>(List.of("LHR", "BCN", "PRG", "SIN", "DUB"));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Test_getFlights_for_result() {
        List<SkyScannerInterview.Flight> data = new ArrayList<>();
        data.add(new FlightModel("EDI", "LHR", 123.45));
        data.add(new FlightModel("EDI", "LHR", 113.45));
        data.add(new FlightModel("EDI","SIN", 300.90));
        data.add(new FlightModel("EDI","BOM", 547.50));
        data.add(new FlightModel("EDI","DUB", 47.50));
        data.add(new FlightModel("DUB","BCN", 99.50));

        Set<String> actual = subject.getFlights(data, "EDI", 500);

        Set<String> expected = new HashSet<>(List.of("LHR", "SIN", "DUB"));
        Assertions.assertEquals(expected, actual);
    }

    static class FlightModel implements SkyScannerInterview.Flight {
        String origin;
        String destination;
        double fare;

        public FlightModel(String origin, String destination, double fare) {
            this.origin = origin;
            this.destination = destination;
            this.fare = fare;
        }

        @Override
        public String getOrigin() {
            return origin;
        }

        @Override
        public String getDestination() {
            return destination;
        }

        @Override
        public double getFare() {
            return fare;
        }
    }
}