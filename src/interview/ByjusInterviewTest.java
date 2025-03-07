package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class ByjusInterviewTest {
    private ByjusInterview subject;

    @BeforeEach
    void setUp() {
        subject = new ByjusInterview();
    }

    @AfterEach
    void tearDown() {
        subject = null;
    }
}