package sorting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class InsertionSortTest {
    private InsertionSort insertionSort;

    @BeforeEach
    void setUp() {
        insertionSort = new InsertionSort();
    }

    @AfterEach
    void tearDown() {
        insertionSort = null;
    }

    @Test
    void Array_should_sorted() {
        List<Integer> unsorted = new ArrayList<>(Arrays.asList(3, 4, 7, 5, 6, 2, 1));
        int size = 7;

        insertionSort.insertionSort2(size, unsorted);

        List<Integer> sorted = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        Assertions.assertEquals(sorted, unsorted);
    }
}