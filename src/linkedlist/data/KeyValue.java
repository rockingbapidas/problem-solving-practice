package linkedlist.data;

public class KeyValue {
    public int key;
    public int value;

    public KeyValue(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
