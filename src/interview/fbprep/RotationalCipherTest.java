package interview.fbprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RotationalCipherTest {
    private RotationalCipher rotationalCipher;

    @BeforeEach
    void setUp() {
        rotationalCipher = new RotationalCipher();
    }

    @AfterEach
    void tearDown() {
        rotationalCipher = null;
    }

    @Test
    void Test_rotation_cipher_case_1() {
        String actual = rotationalCipher.rotationalCipher("Zebra-493?", 3);

        Assertions.assertEquals("Cheud-726?", actual);
    }

    @Test
    void Test_rotation_cipher_case_2() {
        String actual = rotationalCipher.rotationalCipher("abcdefghijklmNOPQRSTUVWXYZ0123456789", 39);

        Assertions.assertEquals("nopqrstuvwxyzABCDEFGHIJKLM9012345678", actual);
    }
}