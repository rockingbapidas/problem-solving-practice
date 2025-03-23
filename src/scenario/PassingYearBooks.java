package scenario;

import java.util.Arrays;

public class PassingYearBooks {
    int[] findSignatureCounts(int[] arr) {
        int[] output = new int[arr.length];

        Arrays.fill(output, 1);

        for (int i = 0; i < arr.length; i++) {
            int k = i;
            while (arr[k] != i + 1) {
                output[i]++;
                k = arr[k] - 1;
            }
        }

        return output;
    }
}
