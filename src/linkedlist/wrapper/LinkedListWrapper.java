package linkedlist.wrapper;

public interface LinkedListWrapper<T> {
    void build(int[] arr);

    T get(int index);

    boolean isEmpty();

    int length();

    void addAtHead(int val);

    void addAtHead(T linkedList);

    void deleteAtHead();

    void addAtTail(int val);

    void addAtTail(T linkedList);

    void deleteAtTail();

    void addAtIndex(int index, int val);

    void addAtIndex(int index, T linkedList);

    void deleteAtIndex(int index);
}
