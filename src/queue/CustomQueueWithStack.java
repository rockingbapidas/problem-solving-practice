package queue;

import java.util.Stack;

public class CustomQueueWithStack {
    private final Stack<Integer> mStackOne;
    private final Stack<Integer> mStackTwo;

    public CustomQueueWithStack() {
        mStackOne = new Stack<>();
        mStackTwo = new Stack<>();
    }

    public void addToQueue(int element) {
        mStackOne.push(element);
    }

    public int dequeue() {
        if (mStackTwo.isEmpty()) {
            changeQueues(mStackOne, mStackTwo);
        }
        return mStackTwo.pop();
    }

    public int getElementAtFront() {
        if (mStackTwo.isEmpty()) {
            changeQueues(mStackOne, mStackTwo);
        }
        return mStackTwo.peek();
    }

    public boolean empty() {
        return mStackOne.isEmpty() && mStackTwo.isEmpty();
    }

    private void changeQueues(Stack<Integer> origin, Stack<Integer> destin) {
        while (!origin.empty()) {
            destin.push(origin.pop());
        }
    }
}
