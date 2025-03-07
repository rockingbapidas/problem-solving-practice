package linkedlist.wrapper;

public interface LinkedListWrapper<T> {
    T get(int index);

    boolean isEmpty();

    int length();

    void addAtHead(int val);

    void deleteAtHead();

    void addAtTail(int val);

    void deleteAtTail();

    void addAtIndex(int index, int val);

    void deleteAtIndex(int index);
}
