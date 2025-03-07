package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FlipkartInterviewTest {
    private FlipkartInterview flipkartInterview;

    @BeforeEach
    void setUp() {
        flipkartInterview = new FlipkartInterview();
    }

    @AfterEach
    void tearDown() {
        flipkartInterview = null;
    }

    @Test
    void Search_Element_Should_Found() {
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};

        String actual = flipkartInterview.searchElement(arr, 29);

        Assertions.assertEquals("Element found", actual);
    }

    @Test
    void Search_Element_Should_Not_Found() {
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};

        String actual = flipkartInterview.searchElement(arr, 38);

        Assertions.assertEquals("Element not found", actual);
    }

    @Test
    void Test_Zigzag_Level_order_traversal() {
        FlipkartInterview.TreeNode treeNode = getRoot();

        List<Integer> actual = flipkartInterview.zigZagLevelOrderTraversalStack(treeNode);

        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));

        Assertions.assertEquals(expected, actual);
    }

    private FlipkartInterview.TreeNode getRoot() {
        return new FlipkartInterview.TreeNode(2,
                new FlipkartInterview.TreeNode(3, new FlipkartInterview.TreeNode(5), null),
                new FlipkartInterview.TreeNode(4, new FlipkartInterview.TreeNode(6),
                        new FlipkartInterview.TreeNode(7)));
    }
}