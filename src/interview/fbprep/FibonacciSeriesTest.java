package interview.fbprep;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonacciSeriesTest {
    private FibonacciSeries fibonacciSeries;

    @BeforeEach
    void setUp() {
        fibonacciSeries = new FibonacciSeries();
    }

    @AfterEach
    void tearDown() {
        fibonacciSeries = null;
    }

    @Test
    void Test_febonacci() {
        int actual = fibonacciSeries.febonacci(10);

        Assertions.assertEquals(34, actual);
    }
}