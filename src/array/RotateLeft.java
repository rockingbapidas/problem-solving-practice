package array;

public class RotateLeft {
    private int[] rotate(int[] a, int d) {
        int lengthOfArray = a.length;
        int actualArray = lengthOfArray - d;
        int[] arr = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            int newLocation = (i + actualArray) % lengthOfArray;
            arr[newLocation] = a[i];
        }
        return arr;
    }
}
