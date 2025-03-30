package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue implements CustomStack<Integer> {
    Queue<Integer> queue1 =  new LinkedList<>();
    Queue<Integer> queue2 =  new LinkedList<>();

    @Override
    public void push(Integer value) {
        queue2.offer(value);

        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public Integer pop() {
        if (queue1.isEmpty()) return -1;
        return queue1.remove();
    }

    public Integer top() {
        if (queue1.isEmpty()) return -1;
        return queue1.peek();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

    @Override
    public Integer peek() {
        if (queue1.isEmpty()) return -1;
        return queue1.peek();
    }
}
