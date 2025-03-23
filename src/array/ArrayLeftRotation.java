package array;

import java.util.List;

public class ArrayLeftRotation {

    public List<Integer> rotate(List<Integer> a, int d){
        return rotateWithList(a, d);
    }

    public List<Integer> rotateWithList(List<Integer> a, int d) {
        // Write your code here
        for (int i = 0; i < d; i++) {
            int first = a.get(0);
            a.remove(0);
            a.add(first);
        }
        return a;
    }

    public int[] rotateWithIntArray(int[] a, int d) {
        int lengthOfArray = a.length;
        int startLocation = lengthOfArray - d;
        int[] arr = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            int newLocation = (i + startLocation) % lengthOfArray;
            arr[newLocation] = a[i];
        }
        return arr;
    }
}
