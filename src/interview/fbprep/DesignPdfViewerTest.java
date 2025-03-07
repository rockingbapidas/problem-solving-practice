package interview.fbprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DesignPdfViewerTest {
    private DesignPdfViewer designPdfViewer;

    @BeforeEach
    void setUp() {
        designPdfViewer = new DesignPdfViewer();
    }

    @AfterEach
    void tearDown() {
        designPdfViewer = null;
    }

    @Test
    void Highlighted_area_should_be_9() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5,
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5));
        String word = "abc";
        int actual = designPdfViewer.designerPdfViewer(list, word);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Highlighted_area_should_be_28() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5,
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7));
        String word = "zaba";
        int actual = designPdfViewer.designerPdfViewer(list, word);
        int expected = 28;
        Assertions.assertEquals(expected, actual);
    }
}