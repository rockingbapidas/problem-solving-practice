package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class MicrosoftInterviewTest {
    private MicrosoftInterview microsoftInterview;

    @BeforeEach
    void setUp() {
        microsoftInterview = new MicrosoftInterview();
    }

    @AfterEach
    void tearDown() {
        microsoftInterview = null;
    }
}