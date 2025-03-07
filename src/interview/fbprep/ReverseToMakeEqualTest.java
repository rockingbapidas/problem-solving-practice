package interview.fbprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseToMakeEqualTest {
    private ReverseToMakeEqual reverseToMakeEqual;

    @BeforeEach
    void setUp() {
        reverseToMakeEqual = new ReverseToMakeEqual();
    }

    @AfterEach
    void tearDown() {
        reverseToMakeEqual = null;
    }

    @Test
    void Test_reverse_to_make_equal_case_1() {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{1, 4, 3, 2, 5};

        boolean actual = reverseToMakeEqual.areTheyEqual(a, b);

        Assertions.assertTrue(actual);
    }

    @Test
    void Test_reverse_to_make_equal_case_2() {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{3, 4, 1, 2};

        boolean actual = reverseToMakeEqual.areTheyEqual(a, b);

        Assertions.assertTrue(actual);
    }

    @Test
    void Test_reverse_to_make_equal_case_3() {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{3, 4, 1, 5};

        boolean actual = reverseToMakeEqual.areTheyEqual(a, b);

        Assertions.assertFalse(actual);
    }
}