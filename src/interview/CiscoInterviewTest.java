package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CiscoInterviewTest {
    private CiscoInterview ciscoInterview;

    @BeforeEach
    void setUp() {
        ciscoInterview = new CiscoInterview();
    }

    @AfterEach
    void tearDown() {
        ciscoInterview = null;
    }
    @Test
    void Minimum_Meeting_Room_Should_be_3() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(2, 8));
        lists.add(Arrays.asList(3, 9));
        lists.add(Arrays.asList(5, 11));
        lists.add(Arrays.asList(3, 4));
        lists.add(Arrays.asList(11, 15));
        lists.add(Arrays.asList(8, 20));

        int platformCount = ciscoInterview.findMeetingRoom(lists);

        Assertions.assertEquals(3, platformCount);
    }
}