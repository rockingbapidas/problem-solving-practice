package interview.fbprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColorfulNumberTest {
    private ColorfulNumber colorfulNumber;

    @BeforeEach
    void setUp() {
        colorfulNumber = new ColorfulNumber();
    }

    @AfterEach
    void tearDown() {
        colorfulNumber = null;
    }

    @Test
    void Number_Should_colorful() {
        boolean actual = colorfulNumber.isColorFul(3245);

        Assertions.assertTrue(actual);
    }

    @Test
    void Number_Should_not_colorful() {
        boolean actual = colorfulNumber.isColorFul(326);

        Assertions.assertFalse(actual);
    }
}