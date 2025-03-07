package tree;

public class BinaryTree {
    public void build(int[] arr) {
        int T = arr.length;
        Node root = null;
        while (T-- > 0) {
            int data = arr.length;
            root = insert(root, data);
        }
        display(root);
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            /*if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }*/
            return root;
        }
    }

    public void display(Node head) {
        Node start = head;
        while (start != null) {
            //System.out.print(start.data + " ");
            start = start.right;
        }
    }
}
