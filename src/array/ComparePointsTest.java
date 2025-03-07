package array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ComparePointsTest {
    private ComparePoints comparePoints;

    @BeforeEach
    void setUp() {
        comparePoints = new ComparePoints();
    }

    @AfterEach
    void tearDown() {
        comparePoints = null;
    }

    @Test
    void Alice_should_won() {
        List<Integer> alice = new ArrayList<>(Arrays.asList(17,28,30));
        List<Integer> bob = new ArrayList<>(Arrays.asList(99,16,8));

        List<Integer> actual = comparePoints.compareTriplets(alice, bob);

        List<Integer> expected = new ArrayList<>(Arrays.asList(2,1));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Bob_should_won() {
        List<Integer> alice = new ArrayList<>(Arrays.asList(6, 8, 12));
        List<Integer> bob = new ArrayList<>(Arrays.asList(7, 9, 15));

        List<Integer> actual = comparePoints.compareTriplets(alice, bob);

        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 3));
        Assertions.assertEquals(expected, actual);
    }
}