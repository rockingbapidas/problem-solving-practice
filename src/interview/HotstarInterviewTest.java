package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


class HotstarInterviewTest {
    private HotstarInterview subject;

    @BeforeEach
    void setUp() {
        subject = new HotstarInterview();
    }

    @AfterEach
    void tearDown() {
        subject = null;
    }
}