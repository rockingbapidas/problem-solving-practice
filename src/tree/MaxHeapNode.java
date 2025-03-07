package tree;

import java.util.Arrays;

public class MaxHeapNode {
    int[] heap = new int[8];

    public void insert(int n, int value) {
        int i, parent;
        i = n + 1;
        while (i > 1) {
            parent = i / 2;
            if (value <= heap[parent]) {
                heap[i] = value;
                return;
            } else {
                heap[i] = heap[parent];
                i = parent;
            }
        }
        heap[1] = value;
    }

    public void delete(int value) {

    }

    public void printMax() {
        System.out.println(Arrays.toString(heap));
    }
}
