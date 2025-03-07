package interview;

import java.util.*;

public class SkyScannerInterview {
    public interface Flight {
        String getOrigin();

        String getDestination();

        double getFare();
    }

    // Add a method which takes a collection of flights and returns the collection of unique destinations
    // which can be reached from a specific origin for a total fare of 500 or less when any number of
    // intermediate stops are allowed (a -> b -> c -> ... -> n).
    // Example:
    // EDI -> LHR -> GRU: 123.45
    // LHR -> BCN : 80.90
    // BCN -> PRG : 98.4
    // EDI -> SIN : 300.90
    // PRG -> HAN : 400.00
    // EDI -> BOM : 547.50
    // EDI -> DUB : 47.50
    // DUB -> EDI : 53.20
    // DUB -> BCN : 99.50
    // Given the above collection of flights and the origin "EDI":
    // The expected result would be the destination strings "LHR", "BCN", "PRG", "SIN", and "DUB"
    // Note: In this example EDI -> BCN has a total fare of 204.35
    //([EDI -> LHR : 123.45] + [LHR -> BCN : 80.90]) = 204.35
    public Set<String> getConnectingFlights(List<Flight> flights, String origin, double budget) {
        HashMap<String, Double> map = new HashMap<>();
        for (Flight f : flights) {
            if (map.containsKey(f.getOrigin())) {
                if ((map.get(f.getOrigin()) + f.getFare() <= budget &&
                        !Objects.equals(f.getDestination(), origin)) && !map.containsKey(f.getDestination())) {
                    map.put(f.getDestination(), map.get(f.getOrigin()) + f.getFare());
                }
            } else {
                if (f.getFare() <= budget && Objects.equals(f.getOrigin(), origin) &&
                        !Objects.equals(f.getDestination(), origin)) {
                    map.put(f.getDestination(), f.getFare());
                }
            }
        }
        return map.keySet();
    }

    public Set<String> getFlights(List<Flight> flights, String origin, double budget) {
        Set<String> result = new HashSet<>();
        for (Flight f : flights) {
            if (f.getFare() <= budget && Objects.equals(f.getOrigin(), origin) &&
                    !Objects.equals(f.getDestination(), origin)) {
                result.add(f.getDestination());
            }
        }
        return result;
    }
}
