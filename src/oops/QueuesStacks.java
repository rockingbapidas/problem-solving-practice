package oops;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuesStacks {
    private final Stack<Character> myStack = new Stack<>();
    private final Queue<Character> myQueue = new LinkedList<>();

    public void pushCharacter(char c) {
        myStack.add(c);
    }

    public void enqueueCharacter(char c) {
        myQueue.add(c);
    }

    public char popCharacter() {
        return myStack.pop();
    }

    public char dequeueCharacter() {
        char c = myQueue.peek();
        myQueue.remove();
        return c;
    }
}
