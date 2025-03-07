package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ConnectNodes {
    public Node recursivePreOrder(Node root) {
        if (root == null)
            return null;

        if (root.left != null) {
            root.left.next = root.right;
        }

        if (root.right != null && root.next != null) {
            root.right.next = root.next.left;
        }

        recursivePreOrder(root.left);

        recursivePreOrder(root.right);

        return root;
    }

    public Node iterativePreOrder(Node root) {
        if (root == null)
            return null;

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while (!stack.empty()) {
            Node current = stack.pop();

            if (current.left != null) {
                current.left.next = current.right;
            }

            if (current.right != null && current.next != null) {
                current.right.next = current.next.left;
            }

            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return root;
    }

    public Node iterativeLevelOrder(Node root) {
        if (root == null)
            return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        Node temp = null;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node prev = temp;
                temp = queue.poll();

                if (prev != null && i > 0) {
                    prev.next = temp;
                }

                if (temp != null && temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp != null && temp.right != null) {
                    queue.offer(temp.right);
                }
            }

            if (temp != null) {
                temp.next = null;
            }
        }

        return root;
    }
}
