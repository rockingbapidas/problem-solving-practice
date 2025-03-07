package tree;

import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
    public List<Integer> recursion(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        recursion(root.left, list);
        recursion(root.right, list);
        list.add(root.val);
        return list;
    }

    public List<Integer> iterativeWithStack(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode previous = null;
        while (!stack.empty()) {
            TreeNode current = stack.peek();
            if (previous == null || previous.left == current || previous.right == current) {
                if (current.left != null) {
                    stack.push(current.left);
                } else if (current.right != null) {
                    stack.push(current.right);
                } else {
                    stack.pop();
                    list.add(current.val);
                }
            } else if (current.left == previous) {
                if (current.right != null) {
                    stack.push(current.right);
                } else {
                    stack.pop();
                    list.add(current.val);
                }
            } else if (current.right == previous) {
                stack.pop();
                list.add(current.val);
            }
            previous = current;
        }
        return list;
    }

    public List<Integer> iterative(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        TreeNode current = root;
        while (current != null) {
            if (current.right == null) {
                list.add(0, current.val);
                current = current.left;
            } else {
                TreeNode successor = current.right;
                while (successor.left != current && successor.left != null) {
                    successor = successor.left;
                }

                if (successor.left == null) {
                    successor.left = current;
                    list.add(0, current.val);
                    current = current.right;
                } else {
                    successor.left = null;
                    current = current.left;
                }
            }
        }
        return list;
    }
}
