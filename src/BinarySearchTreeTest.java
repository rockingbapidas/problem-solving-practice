import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {
    private BinarySearchTree binarySearchTree;

    @BeforeEach
    void setUp() {
        binarySearchTree = new BinarySearchTree();
    }

    @AfterEach
    void tearDown() {
        binarySearchTree = null;
    }

    @Test
    void Node_should_inserted_at_correct_position() {
        BinarySearchTree.TreeNode root = buildNodes(new int[]{4, 2, 1, 3, 7});

        binarySearchTree.insert(root, 6);

        Assertions.assertTrue(binarySearchTree.contains(root,6));
    }

    @Test
    void It_should_return_correct_height() {
        BinarySearchTree.TreeNode root = buildNodes(new int[]{3, 5, 2, 1, 4, 6, 7});

        int actual = binarySearchTree.getHeight(root);

        Assertions.assertEquals(3, actual);
    }

    private BinarySearchTree.TreeNode buildNodes(int[] arr) {
        BinarySearchTree.TreeNode root = null;
        for (int j : arr) {
            if (root == null) {
                root = new BinarySearchTree.TreeNode(j);
            } else {
                binarySearchTree.insert(root, j);
            }
        }
        return root;
    }
}