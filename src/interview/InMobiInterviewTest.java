package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class InMobiInterviewTest {
    private InMobiInterview inMobiInterview;

    @BeforeEach
    void setUp() {
        inMobiInterview = new InMobiInterview();
    }

    @AfterEach
    void tearDown() {
        inMobiInterview = null;
    }

    @Test
    void Minimum_Platform_Should_be_3() {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        int platformCount = inMobiInterview.findPlatformOptimize(arr, dep);

        Assertions.assertEquals(3, platformCount);
    }

    @Test
    void Minimum_Platform_Should_be_1() {
        int[] arr = {900, 940};
        int[] dep = {910, 1200};

        int platformCount = inMobiInterview.findPlatformOptimize(arr, dep);

        Assertions.assertEquals(1, platformCount);
    }
}