package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class VersionAlgorithmTest {

    private VersionAlgorithm versionAlgorithm;

    @BeforeEach
    void setUp() {
        versionAlgorithm = new VersionAlgorithm();
    }

    @AfterEach
    void tearDown() {
        versionAlgorithm = null;
    }

    @Test
    void version1_should_bigger() {
        String result = versionAlgorithm.checkVersion("1.0.23.0", "1.0.0.3");

        int result1 = versionAlgorithm.versionCompare("1.0.23.0", "1.0.0.3");

        Assertions.assertEquals(result, "version 1 is big");
        Assertions.assertEquals(result1, 1);
    }

    @Test
    void version2_should_bigger() {
        String result = versionAlgorithm.checkVersion("1.0.0", "1.0.0.3");

        int result1 = versionAlgorithm.versionCompare("1.0.0", "1.0.0.3");

        Assertions.assertEquals(result, "version 2 is big");
        Assertions.assertEquals(result1, -1);
    }
}