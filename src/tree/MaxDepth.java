package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {
    public static int recursive(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = recursive(root.left);
        int rightDepth = recursive(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static int iterative(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int ans = 0;
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current == null) {
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
                ans++;
            } else {
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        return ans;
    }
}
