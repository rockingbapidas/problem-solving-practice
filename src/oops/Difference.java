package oops;

public class Difference {
    private final int[] elements;
    public int maximumDifference;

    Difference(int[] arr) {
        this.elements = arr;
    }

    public void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            int element = elements[i];
            for (int j = i + 1; j < elements.length; j++) {
                int difference = Math.abs(element - elements[j]);
                if (maximumDifference < difference) {
                    maximumDifference = difference;
                }
            }
        }
    }
}
