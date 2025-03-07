package array;

import java.util.Arrays;

public class DuplicateZeros {
    public void duplicate(int[] arr) {
        int length = arr.length;
        int zeroCount = 0;
        int nextPosition = 0;
        System.out.println("Original " + Arrays.toString(arr));
        for (int i = 0; i < length; i++) {
            nextPosition = i + 1;
            if (length == nextPosition) {
                break;
            }
            if (arr[i] == 0) {
                zeroCount++;
            }
            if (arr[i] == 0 && arr[nextPosition] != 0) {
                for (int j = length - 1; j >= nextPosition; j--) {
                    arr[j] = arr[j - zeroCount];
                }
                i = i + zeroCount;
                zeroCount = 0;
            }
        }
        System.out.println("Final " + Arrays.toString(arr));
    }
}
