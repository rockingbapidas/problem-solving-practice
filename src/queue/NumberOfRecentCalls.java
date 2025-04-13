package queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    private final Queue<Integer> queue;

    // This is a queue implementation to keep track of the recent calls
    public NumberOfRecentCalls() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // Add the current time to the queue
        queue.add(t);
        // Remove all times that are older than 3000ms from the current time
        while (!queue.isEmpty() && t - queue.peek() > 3000) {
            queue.poll();
        }
        // Return the size of the queue, which represents the number of recent calls
        return queue.size();
    }
}
