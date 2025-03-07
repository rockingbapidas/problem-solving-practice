package array;

import java.util.Arrays;

public class ReplaceElements {

    public int[] replace(int[] arr) {
        System.out.println(Arrays.toString(arr) + "\n");
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i + 1];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        System.out.println(Arrays.toString(arr));
        arr[arr.length - 1] = -1;
        return arr;
    }
}
