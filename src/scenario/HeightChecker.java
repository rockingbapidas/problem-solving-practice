package scenario;

import java.util.Arrays;

public class HeightChecker {

    public int check(int[] heights) {
        System.out.println("Original " + Arrays.toString(heights));
        int N = heights.length;
        int count = 0;
        int[] arr = new int[N];
        System.arraycopy(heights, 0, arr, 0, N);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted " + Arrays.toString(arr));
        for (int i = 0; i < N; i++) {
            if (arr[i] != heights[i]) {
                count++;
            }
        }
        System.out.println("Count " + count);
        return count;
    }
}
