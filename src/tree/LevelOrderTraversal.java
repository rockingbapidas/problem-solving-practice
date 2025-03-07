package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> recursion(TreeNode root, List<List<Integer>> list, int level) {
        if (root == null)
            return list;
        if (list.size() < level) {
            list.add(new ArrayList<Integer>());
        }
        list.get(level - 1).add(root.val);
        recursion(root.left, list, level + 1);
        recursion(root.right, list, level + 1);
        return list;
    }

    public List<List<Integer>> iterative(TreeNode root, List<List<Integer>> list) {
        if (root == null)
            return list;
        TreeNode current = root;
        while (current != null) {
            List<Integer> newList = new ArrayList<>();
            list.add(newList);
            if (current.left == null) {
                newList.add(current.val);
                current = current.right;
            } else {
                TreeNode predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }
                if (predecessor.right == current) {
                    predecessor.right = null;
                    current = current.right;
                } else {
                    newList.add(current.val);
                    predecessor.right = current;
                    current = current.left;
                }
            }
        }
        return list;
    }

    public List<List<Integer>> iterativeWithQueue(TreeNode root, List<List<Integer>> list) {
        if (root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> newList = new ArrayList<>();
            int size = queue.size();
            list.add(newList);
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current != null) {
                    newList.add(current.val);
                    if (current.left != null) {
                        queue.offer(current.left);
                    }
                    if (current.right != null) {
                        queue.offer(current.right);
                    }
                }
            }
        }
        return list;
    }
}
