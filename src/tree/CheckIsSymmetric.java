package tree;

import java.util.LinkedList;
import java.util.Queue;

public class CheckIsSymmetric {
    public static boolean recursive(TreeNode root) {
        if (root == null)
            return true;
        if (root.left != null && root.right != null) {
            if (root.left.val == root.right.val) {
                return recursive(root.left) && recursive(root.right);
            }
        }
        return false;
    }

    public static boolean iterative(TreeNode root) {
        if (root == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode leftRoot = queue.poll();
            TreeNode rightRoot = queue.poll();

            if (leftRoot == null && rightRoot == null) {
                continue;
            }

            if (leftRoot == null || rightRoot == null) {
                return false;
            }

            queue.offer(leftRoot.left);
            queue.offer(rightRoot.right);
            queue.offer(leftRoot.right);
            queue.offer(rightRoot.left);
        }
        return true;
    }
}
