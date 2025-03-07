package interview.fbprep;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BalancedSplitExistTest {
    private BalancedSplitExist subject;

    @BeforeEach
    void setUp() {
        subject = new BalancedSplitExist();
    }

    @AfterEach
    void tearDown() {
        subject = null;
    }

    @Test
    void Test_balancedSplitExists_case_1() {
        boolean actual = subject.balancedSplitExists(new int[]{1, 5, 7, 1});
        Assertions.assertTrue(actual);
    }

    @Test
    void Test_balancedSplitExists_case_2() {
        boolean actual = subject.balancedSplitExists(new int[]{12, 7, 6, 7, 6});
        Assertions.assertFalse(actual);
    }

    @Test
    void Test_balancedSplitExists_case_3() {
        boolean actual = subject.balancedSplitExists(new int[]{1 , 2 , 3 , 4 , 5 , 5});
        Assertions.assertTrue(actual);
    }
}