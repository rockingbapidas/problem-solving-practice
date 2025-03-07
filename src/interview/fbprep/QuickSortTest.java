package interview.fbprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class QuickSortTest {
    private QuickSort quickSort;

    @BeforeEach
    void setUp() {
        quickSort = new QuickSort();
    }

    @AfterEach
    void tearDown() {
        quickSort = null;
    }

    @Test
    void Array_should_sorted() {
        int[] unsorted = new int[]{5, 8, 1, 3, 7, 9, 2};
        int size = 7;

        quickSort.sort(size, unsorted);

        int[] sorted = new int[]{1, 2, 3, 5, 7, 8, 9};

        Assertions.assertEquals(Arrays.toString(sorted), Arrays.toString(unsorted));
    }

    @Test
    void Array_should_sorted_list() {
        List<Integer> unsorted = new ArrayList<>(Arrays.asList(5, 8, 1, 3, 7, 9, 2));
        int size = 7;

        quickSort.sort(size, unsorted);

        List<Integer> sorted = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7, 8, 9));

        Assertions.assertEquals(sorted, unsorted);
    }
}