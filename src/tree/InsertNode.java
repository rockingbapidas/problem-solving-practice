package tree;

public class InsertNode {
    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        } else {
            TreeNode cur;
            if (data <= root.val) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}
