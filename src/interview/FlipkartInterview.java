package interview;

import java.util.*;

public class FlipkartInterview {

    //Time Complexity O(n), Space Complexity O(1)
    public String searchElement(int[][] arr, int target) {
        int row = 0, col = arr.length - 1;

        while (row < arr.length - 1 && col >= 0) {
            if (arr[row][col] == target) {
                return "Element found";
            }

            if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return "Element not found";
    }

    //Time Complexity O(n^2), Space Complexity O(1)
    public List<List<Integer>> zigZagLevelOrderTraversalQueue(TreeNode root) {
        if (root == null) return null;

        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean zigzag = false;

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                if (current != null) {

                    if (zigzag) {
                        level.add(0, current.val);
                    } else {
                        level.add(current.val);
                    }

                    if (current.left != null) {
                        queue.offer(current.left);
                    }

                    if (current.right != null) {
                        queue.offer(current.right);
                    }
                }
            }
            res.add(level);
            zigzag = !zigzag;
        }
        return res;
    }

    //Time Complexity O(n), Space Complexity O(1)
    public List<Integer> zigZagLevelOrderTraversalStack(TreeNode rootNode) {

        // if null then return 
        if (rootNode == null) return null;

        List<Integer> res = new ArrayList<>();

        // declare two stacks 
        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();

        // push the root 
        currentLevel.push(rootNode);
        boolean leftToRight = true;

        // check if stack is empty 
        while (!currentLevel.isEmpty()) {

            // pop out of stack 
            TreeNode node = currentLevel.pop();

            // print the data in it 
            res.add(node.val);

            // store data according to current 
            // order. 
            if (leftToRight) {
                if (node.left != null) {
                    nextLevel.push(node.left);
                }

                if (node.right != null) {
                    nextLevel.push(node.right);
                }
            } else {
                if (node.right != null) {
                    nextLevel.push(node.right);
                }

                if (node.left != null) {
                    nextLevel.push(node.left);
                }
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<TreeNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }

        return res;
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}