package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class PhonePeInterviewTest {
    private PhonePeInterview phonePeInterview;

    @BeforeEach
    void setUp() {
        phonePeInterview = new PhonePeInterview();
    }

    @AfterEach
    void tearDown() {
        phonePeInterview = null;
    }

    @Test
    void Name_Should_be_Sorted() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("Shailash", "Rahul", "Moumita"));

        ArrayList<String> actual = phonePeInterview.nameSorted(input);

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Shailash", "Rahul", "Moumita"));

        Assertions.assertEquals(expected, actual);
    }
}