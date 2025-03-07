package tree;

import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
    public List<Integer> recursion(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        list.add(root.val);
        recursion(root.left, list);
        recursion(root.right, list);
        return list;
    }

    public List<Integer> iterativeWithStack(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode current = stack.pop();
            list.add(current.val);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return list;
    }

    public List<Integer> iterative(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        TreeNode current = root;
        while (current != null) {
            if (current.left == null) {
                list.add(current.val);
                current = current.right;
            } else {
                TreeNode predecessor = current.left;
                while (predecessor.right != current && predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                if (predecessor.right == null) {
                    predecessor.right = current;
                    list.add(current.val);
                    current = current.left;
                } else {
                    predecessor.right = null;
                    current = current.right;
                }
            }
        }
        return list;
    }
}
