package stack;

public class StackWithArray implements CustomStack<Integer> {
    private final int[] stack;
    private int top;
    private final int capacity;

    public StackWithArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    /**
     * Pushes the value into the stack
     * @param value the value to be pushed
     */
    public void push(Integer value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = value;
    }

    /**
     * Pops the value from the stack
     * @return the value popped from the stack
     */
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    /**
     * Returns the top element of the stack without removing it
     * @return the top element of the stack
     */
    public Integer top() {
        return stack[top];
    }

    /**
     * Checks if the stack is full
     * @return true if the stack is full, false otherwise
     */
    public boolean isFull() {
        return top == capacity - 1;
    }

    /**
     * Checks if the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Returns the top element of the stack
     * @return the top element of the stack
     */
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    /**
     * Prints the stack
     */
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
