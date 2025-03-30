package queue;

import java.util.PriorityQueue;

public class QueueHeap {
    PriorityQueue<Integer> heap = new PriorityQueue<>();

    public void insert(int value) {
        heap.add(value);
    }

    public void delete(int value) {
        heap.remove(value);
    }

    public void print() {
        System.out.println(heap.peek());
    }
}
