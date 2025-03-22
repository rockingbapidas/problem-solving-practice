package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyHashSetTest {
    @Test
    void test_my_hash_set() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.mNodeHead.print();
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.mNodeHead.print();
        Assertions.assertTrue(myHashSet.contains(1)); // return True
        Assertions.assertFalse(myHashSet.contains(3)); // return False, (not found)
        myHashSet.add(2);
        myHashSet.mNodeHead.print();// set = [1, 2]
        Assertions.assertTrue(myHashSet.contains(2)); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.mNodeHead.print();
        Assertions.assertFalse(myHashSet.contains(2)); // return False, (already removed)
    }
}