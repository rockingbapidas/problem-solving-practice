package array;

public class ArrayManipulation {
    private long manipulate(int n, int[][] queries) {
        long[] arr = new long[n];
        for (int[] query : queries) {
            int a = query[0] - 1;
            int b = query[1] - 1;
            int k = query[2];
            arr[a] += k;
            if (b + 1 < n) {
                arr[b + 1] -= k;
            }
        }
        long max = Long.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
