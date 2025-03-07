package array;

public class MinimumSwaps {

    public int minimum(int[] arr) {
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                while (arr[i] != i + 1) {
                    int temp = 0;
                    temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;
                    count++;
                }
            }
            i++;
        }
        return count;
    }

    public int findMinSwaps(int[] arr, int n) {
        // Array to store count of zeroes
        int[] noOfZeroes = new int[n];
        int i, count = 0;

        // Count number of zeroes
        // on right side of every one.
        noOfZeroes[n - 1] = 1 - arr[n - 1];
        for (i = n - 2; i >= 0; i--) {
            noOfZeroes[i] = noOfZeroes[i + 1];
            if (arr[i] == 0)
                noOfZeroes[i]++;
        }

        // Count total number of swaps by adding number
        // of zeroes on right side of every one.
        for (i = 0; i < n; i++) {
            if (arr[i] == 1)
                count += noOfZeroes[i];
        }
        return count;
    }

}
