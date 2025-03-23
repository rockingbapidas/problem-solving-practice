package scenario;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PassingYearBooksTest {
    private PassingYearBooks passingYearBooks;

    @BeforeEach
    void setUp() {
        passingYearBooks = new PassingYearBooks();
    }

    @AfterEach
    void tearDown() {
        passingYearBooks = null;
    }

    @Test
    void Test_passing_year_books_case_1() {
        int[] input = {2, 1};

        int[] actual = passingYearBooks.findSignatureCounts(input);

        int[] expected = {2, 2};

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void Test_passing_year_books_case_2() {
        int[] input = {1, 2};

        int[] actual = passingYearBooks.findSignatureCounts(input);

        int[] expected = {1, 1};

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}