import java.util.Stack;

public class MyCustomQueue {
    private final Stack<Integer> mStackOne;
    private final Stack<Integer> mStackTwo;

    public MyCustomQueue() {
        mStackOne = new Stack<>();
        mStackTwo = new Stack<>();
    }

    public void addToQueue(int element) {
        mStackOne.push(element);
    }

    public void dequeue() {
        if (mStackTwo.isEmpty()) {
            changeQueues(mStackOne, mStackTwo);
        }
        mStackTwo.pop();
    }

    public void printElementAtFront() {
        if (mStackTwo.isEmpty()) {
            changeQueues(mStackOne, mStackTwo);
        }
        System.out.println(mStackTwo.peek());
    }

    public int getElementAtFront() {
        if (mStackTwo.isEmpty()) {
            changeQueues(mStackOne, mStackTwo);
        }
        return mStackTwo.peek();
    }

    private void changeQueues(Stack<Integer> origin, Stack<Integer> destin) {
        while (!origin.empty()) {
            destin.push(origin.pop());
        }
    }
}
