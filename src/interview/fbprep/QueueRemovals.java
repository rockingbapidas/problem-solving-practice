package interview.fbprep;

import java.util.*;

public class QueueRemovals {

    static class Pair {
        private final int value1;
        private final int value2;

        Pair(int a, int b) {
            value1 = a;
            value2 = b;
        }

        int getFirst() {
            return value1;
        }

        int getSecond() {
            return value2;
        }
    }

    int[] findPositions(int[] arr, int x) {
        // Write your code here
        return nonOptimize(arr, x);
    }

    private int[] nonOptimize(int[] arr, int x) {
        List<Integer> ans = new ArrayList<>();

        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(new Pair(i, arr[i]));
        }

        for (int i = 1; i <= x; i++) {
            List<Pair> popped = new ArrayList<>();
            int max = -1;
            int j = 0;
            int index_to_remove = -1;
            while (!queue.isEmpty() && j < x) {
                Pair pop = queue.poll();
                if (pop.getSecond() > max) {
                    max = pop.getSecond();
                    index_to_remove = pop.getFirst();
                }
                popped.add(pop);
                j++;
            }

            for (Pair entry : popped) {
                if (entry.getFirst() != index_to_remove)
                    queue.add(new Pair(entry.getFirst(), Math.max(0, entry.getSecond() - 1)));
            }
            ans.add(index_to_remove + 1);
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
