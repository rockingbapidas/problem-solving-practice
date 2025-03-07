package array;

import java.util.Arrays;

public class SortArrayByParity {
    public int[] sort(int[] A) {
        System.out.println(Arrays.toString(A) + "\n");
        int writePointer = 0;
        for (int readPointer = 0; readPointer < A.length; readPointer++) {
            if (A[readPointer] % 2 == 0) {
                int temp = A[writePointer];
                A[writePointer] = A[readPointer];
                A[readPointer] = temp;
                writePointer++;
            }
        }
        System.out.println(Arrays.toString(A));
        return A;
    }
}
