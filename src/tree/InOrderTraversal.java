package tree;

import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    public List<Integer> recursion(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        recursion(root.left, list);
        list.add(root.val);
        recursion(root.right, list);
        return list;
    }

    public List<Integer> iterativeWithStack(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while (true) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                if (stack.empty()) {
                    break;
                } else {
                    TreeNode temp = stack.pop();
                    list.add(temp.val);
                    current = temp.right;
                }
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
                    current = current.left;
                } else {
                    predecessor.right = null;
                    list.add(current.val);
                    current = current.right;
                }
            }
        }
        return list;
    }
}
