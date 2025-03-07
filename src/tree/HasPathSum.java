package tree;

import java.util.Stack;

public class HasPathSum {
    public boolean recursive(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && sum - root.val == 0)
            return true;
        return recursive(root.left, sum - root.val) || recursive(root.right, sum - root.val);
    }

    public boolean iterative(TreeNode root, int sum) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode current = stack.pop();
            if (current != null) {
                if (current.left == null && current.right == null && current.val == sum) {
                    return true;
                }
                if (current.right != null) {
                    current.right.val += current.val;
                    stack.push(current.right);
                }
                if (current.left != null) {
                    current.left.val += current.val;
                    stack.push(current.left);
                }
            }
        }
        return false;
    }
}
