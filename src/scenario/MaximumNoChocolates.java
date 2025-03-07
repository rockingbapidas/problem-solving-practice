package scenario;

import java.util.HashMap;

public class MaximumNoChocolates {
    public int maxNumOfChocolates(int n, int[] bags) {
        HashMap<Integer, Integer> um = new HashMap<>();
        int[] sum = new int[n];
        int curr_rem;
        int maxSum = 0;
        sum[0] = bags[0];
        for (int i = 1; i < n; i++)
            sum[i] = sum[i - 1] + bags[i];
        for (int i = 0; i < n; i++) {
            curr_rem = sum[i];
            if (curr_rem == 0) {
                if (maxSum < sum[i])
                    maxSum = sum[i];
            }
            else if (!um.containsKey(curr_rem))
                um.put(curr_rem, i);
            else
            if (maxSum < (sum[i] - sum[um.get(curr_rem)]))
                maxSum = sum[i] - sum[um.get(curr_rem)];
        }
        return maxSum;
    }
}
