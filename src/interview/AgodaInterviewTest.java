package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgodaInterviewTest {
    private AgodaInterview agodaInterview;

    @BeforeEach
    void setUp() {
        agodaInterview = new AgodaInterview();
    }

    @AfterEach
    void tearDown() {
        agodaInterview = null;
    }

    @Test
    void Should_return_correct_rle() {
        String actual = agodaInterview.rleCount("abbaaaac");

        Assertions.assertEquals("1a2b4a1c", actual);
    }
}