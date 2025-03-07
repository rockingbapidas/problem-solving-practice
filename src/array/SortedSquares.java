package array;

import java.util.Arrays;

public class SortedSquares {
    public void sort(int[] A) {
        System.out.println("Original " + Arrays.toString(A));
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        System.out.println("Square " + Arrays.toString(A));
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println("Sorted " + Arrays.toString(A));
    }
}
