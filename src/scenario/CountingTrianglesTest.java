package scenario;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CountingTrianglesTest {
    private CountingTriangles subject;

    @BeforeEach
    void setUp() {
        subject = new CountingTriangles();
    }

    @AfterEach
    void tearDown() {
        subject = null;
    }

    @Test
    void Test_countDistinctTriangles_case_1() {
        ArrayList<CountingTriangles.Sides> list = new ArrayList<>();
        list.add(new CountingTriangles.Sides(2, 2, 3));
        list.add(new CountingTriangles.Sides(3, 2, 2));
        list.add(new CountingTriangles.Sides(2, 5, 6));

        int actual = subject.countDistinctTriangles(list);

        Assertions.assertEquals(2, actual);
    }

    @Test
    void Test_countDistinctTriangles_case_2() {
        ArrayList<CountingTriangles.Sides> list = new ArrayList<>();
        list.add(new CountingTriangles.Sides(8, 4, 6));
        list.add(new CountingTriangles.Sides(100, 101, 102));
        list.add(new CountingTriangles.Sides(84, 93, 173));

        int actual = subject.countDistinctTriangles(list);

        Assertions.assertEquals(3, actual);
    }

    @Test
    void Test_countDistinctTriangles_case_3() {
        ArrayList<CountingTriangles.Sides> list = new ArrayList<>();
        list.add(new CountingTriangles.Sides(5, 8, 9));
        list.add(new CountingTriangles.Sides(5, 9, 8));
        list.add(new CountingTriangles.Sides(9, 5, 8));
        list.add(new CountingTriangles.Sides(9, 8, 5));
        list.add(new CountingTriangles.Sides(8, 9, 5));
        list.add(new CountingTriangles.Sides(8, 5, 9));

        int actual = subject.countDistinctTriangles(list);

        Assertions.assertEquals(1, actual);
    }
}