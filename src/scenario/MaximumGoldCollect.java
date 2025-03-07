package scenario;

public class MaximumGoldCollect {
    //Time complexity O(n^2 * m^2), Space complexity O(n^2 * m^2)
    public static void collectGold(int[][] gold) {
        int N = gold.length;
        int[][] goldTable = new int[N][N];

        for (int col = N - 1; col >= 0; col--) {
            for (int row = 0; row < N; row++) {
                // Gold collected on going to
                // the cell on the right(->)
                int right = (col == N - 1) ? 0 : goldTable[row][col + 1];

                // Gold collected on going to
                // the cell to right up (/)
                int right_up = (row == 0 || col == N - 1) ? 0 : goldTable[row - 1][col + 1];

                // Gold collected on going to
                // the cell to right down (\)
                int right_down = (row == N - 1 || col == N - 1) ? 0 : goldTable[row + 1][col + 1];

                // Max gold collected from taking
                // either of the above 3 paths
                goldTable[row][col] = gold[row][col] + Math.max(right, Math.max(right_up, right_down));
            }
        }

        // The max amount of gold collected will be
        // the max value in first column of all rows
        int res = goldTable[0][0];

        for (int i = 1; i < N; i++) {
            res = Math.max(res, goldTable[i][0]);
        }

        System.out.println("Maximum gold can collect " + res);
    }
}
