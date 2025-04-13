package queue;

import java.util.Queue;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new java.util.LinkedList<>();
        for (int student : students) {
            queue.offer(student);
        }
        int sandwichIndex = 0;
        while (!queue.isEmpty() && sandwichIndex < sandwiches.length) {
            if (queue.peek() == sandwiches[sandwichIndex]) {
                queue.poll();
                sandwichIndex++;
            } else {
                queue.offer(queue.poll());
            }
        }
        return queue.size();
    }
}
