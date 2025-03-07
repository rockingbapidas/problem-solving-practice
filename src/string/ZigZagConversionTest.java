package string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZigZagConversionTest {
    private ZigZagConversion subject;

    @BeforeEach
    void setUp() {
        subject = new ZigZagConversion();
    }

    @AfterEach
    void tearDown() {
        subject = null;
    }

    @Test
    void Test_zig_zag_convert_3(){
        String actual = subject.convert_2("PAYPALISHIRING", 3);

        Assertions.assertEquals("PAHNAPLSIIGYIR", actual);
    }

    @Test
    void Test_zig_zag_convert_4(){
        String actual = subject.convert("PAYPALISHIRING", 4);

        Assertions.assertEquals("PINALSIGYAHRPI", actual);
    }

    @Test
    void Test_zig_zag_convert(){
        String actual = subject.convert("AB", 1);

        Assertions.assertEquals("AB", actual);
    }
}