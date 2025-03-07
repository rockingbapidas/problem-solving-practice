package interview.fbprep;

import java.util.Arrays;

public class BalancedSplitExist {
    boolean balancedSplitExists(int[] arr) {
        return optimize(arr);
    }

    //Todo this method is producing wrong output in case of test case 1
    private boolean nonOptimize(int[] arr) {
        int splitIndex = -1;

        int leftSum = 0;
        for (int value : arr) {
            leftSum += value;
        }

        int rightSum = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            rightSum += arr[j];

            leftSum -= arr[j];

            if (leftSum == rightSum) {
                splitIndex = j;
                break;
            }
        }

        if (splitIndex == -1) {
            return false;
        } else {
            int[] A = Arrays.copyOfRange(arr, 0, splitIndex);
            int[] B = Arrays.copyOfRange(arr, splitIndex, arr.length);

            for (int j : A) {
                for (int k : B) {
                    if (j > k) return false;
                }
            }
            return true;
        }
    }

    //Todo did not understood the procedure
    private boolean optimize(int[] arr) {
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] * 2 == arr[arr.length - 1] && (arr[i] - arr[i - 1]) != (arr[i + 1] - arr[i]))
                return true;
        }

        return false;
    }
}
