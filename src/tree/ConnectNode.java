package tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNode {

    public Node iterativeLevelOrder(Node root) {
        if (root == null)
            return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node prev = null;
            while (size-- > 0) {
                Node temp = queue.poll();
                temp.next = prev;
                prev = temp;

                if (temp.right != null) {
                    queue.offer(temp.right);
                }

                if (temp.left != null) {
                    queue.offer(temp.left);
                }
            }
        }

        return root;
    }

    public Node recursivePreOrder(Node root) {
        if (root == null)
            return null;

        if (root.left != null) {
            if (root.right == null && root.next != null) {
                Node itr = root.next;
                while (itr.next != null && itr.left == null && itr.right == null) {
                    itr = itr.next;
                }
                root.left.next = (itr.left != null) ? itr.left : itr.right;
            } else {
                root.left.next = root.right;
            }
        }

        if (root.right != null && root.next != null) {
            Node itr = root.next;
            while (itr.next != null && itr.left == null && itr.right == null) {
                itr = itr.next;
            }
            root.right.next = (itr.left != null) ? itr.left : itr.right;
        }

        recursivePreOrder(root.right);
        recursivePreOrder(root.left);

        return root;
    }
}
