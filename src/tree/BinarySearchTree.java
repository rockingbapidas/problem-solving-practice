package tree;

public class BinarySearchTree {
    public static class TreeNode {
        TreeNode right, left;
        int data;

        public TreeNode(int value) {
            this.data = value;
        }
    }

    public void insert (TreeNode root , int value) {
       if (value <= root.data) {
            if (root.left == null) {
                root.left = new TreeNode(value);
            } else {
                insert(root.left, value);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(value);
            } else {
                insert(root.right, value);
            }
        }
    }
    public int getHeight(TreeNode root) {
        if (root == null)
            return -1;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left, right) + 1;
    }

    public boolean contains(TreeNode root, int value) {
        if (root.data == value) return true;

        if (value < root.data) {
            if (root.left == null) {
                return false;
            } else {
                return contains(root.left, value);
            }
        } else {
            if (root.right == null) {
                return false;
            } else {
                return contains(root.right, value);
            }
        }
    }

    public void printPreOrder(TreeNode root) {
        System.out.print(root.data + " ");
        if (root.left != null) {
            printPreOrder(root.left);
        }
        if (root.right != null) {
            printPreOrder(root.right);
        }
    }

    public void printInOrder(TreeNode root) {
        if (root.left != null) {
            printInOrder(root.left);
        }
        System.out.print(root.data + " ");
        if (root.right != null) {
            printInOrder(root.right);
        }
    }

    public void printPostOrder(TreeNode root) {
        if (root.left != null) {
            printPostOrder(root.left);
        }
        if (root.right != null) {
            printPostOrder(root.right);
        }
        System.out.print(root.data + " ");
    }
}
