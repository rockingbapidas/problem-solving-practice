package interview.fbprep;

import java.util.Arrays;
import java.util.HashMap;

public class PairSums {
    public int numberOfWays(int[] arr, int k) {
        return optimize1(arr, k);
    }

    //Time Complexity O(n*n), Space Complexity O(1)
    private int nonOptimize(int[] arr, int k) {
        int pairCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }

    //Time Complexity O(n log n + n), Space Complexity O(1)
    //Todo This method is wrong in case of second test case
    private int optimize1(int[] arr, int k) {
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;
        int count = 0;

        while (i < j) {
            if (arr[i] + arr[j] > k) {
                j--;
            } else if (arr[i] + arr[j] < k) {
                i++;
            } else {
                System.out.println("Pair("+arr[i]+ " " + arr[j] + ")");
                count++;
                i++;
            }
        }

        return count;
    }

    //Time Complexity O(n), Space Complexity O(n)
    private int optimize2(int[] arr, int k) {
        int pairCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(k - j)) {
                pairCount += map.get(k - j);
            }

            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        return pairCount;
    }
}
