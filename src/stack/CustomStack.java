package stack;

public interface CustomStack<T> {
    void push(T value);

    T pop();

    T top();

    boolean isFull();

    boolean isEmpty();

    T peek();
}
