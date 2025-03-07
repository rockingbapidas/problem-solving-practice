package array;

import java.util.Arrays;

public class FindThirdMaxNumber {
    public int thirdMax(int[] array) {
        System.out.println("Original " + Arrays.toString(array));
        int n = array.length;
        if (n < 3) {
            return Math.max(array[0], array[1]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted " + Arrays.toString(array));
        boolean found = false;
        int firstMax = array[n - 1];
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int index = n - 1; index >= 0; index--) {
            if (array[index] < firstMax) {
                if (array[index] < secondMax) {
                    thirdMax = array[index];
                    found = true;
                    break;
                }
                secondMax = array[index];
            }
        }
        return found ? thirdMax : firstMax;
    }
}
