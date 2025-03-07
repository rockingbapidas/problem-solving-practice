package tree;

public class HeightOfBinaryTree {

    public int height(Node root) {
        // Write your code here.
        if (root == null) return -1;

        int leftCount = height(root.left);
        int rightCount = height(root.right);

        return Math.max(leftCount, rightCount) + 1;
    }
}
