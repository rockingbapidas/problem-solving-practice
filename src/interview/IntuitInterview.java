package interview;

public class IntuitInterview {
    public int checkSumOfMatrix(int[][] arr) {
        int sum = 0;
        for (int[] ints : arr) {
            if (ints.length > 0) {
                int small = ints[0];
                int big = ints[0];
                for (int v : ints) {
                    if (small > v)
                        small = v;

                    if (big < v)
                        big = v;
                }
                sum += big - small;
            }
        }
        return sum;
    }
}
