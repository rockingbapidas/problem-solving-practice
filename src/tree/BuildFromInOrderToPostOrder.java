package tree;

import java.util.Stack;

public class BuildFromInOrderToPostOrder {
    public TreeNode iterative(int[] inorder, int[] postorder) {
        if (postorder.length == 0)
            return null;

        int postSize = postorder.length - 1;
        int inSize = inorder.length - 1;
        int flag = 0;

        TreeNode temp = new TreeNode(postorder[postSize--]);
        System.out.print(temp.val);
        TreeNode root = temp;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(temp);

        while (postSize >= 0) {
            if (!stack.isEmpty() && stack.peek().val == inorder[inSize]) {
                flag = 1;
                temp = stack.pop();
                inSize--;
            } else {
                if (flag == 0) {
                    temp.right = new TreeNode(postorder[postSize--]);
                    temp = temp.right;
                } else {
                    flag = 0;
                    temp.left = new TreeNode(postorder[postSize--]);
                    temp = temp.left;
                }
                System.out.print(temp.val);
                stack.push(temp);
            }
        }
        return root;
    }

    public TreeNode recursive(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd)
            return null;

        int rootValue = postorder[postEnd];
        System.out.println(rootValue);

        TreeNode root = new TreeNode(rootValue);

        int rootIndex = 0;
        for (int i = 0; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }

        int rootPredecessor = rootIndex - 1; // predeccessor of root
        int rootSuccessor = rootIndex + 1; // successor or root

        int nextRootForLeft = postStart + (rootIndex - inStart) - 1; // next root element for left
        int nextRootForRight = postEnd - 1; // next root element for right

        int rightPostStart = postEnd - (inEnd - rootIndex);

        // for left
        root.left = recursive(inorder, postorder, inStart, rootPredecessor, postStart, nextRootForLeft);

        // for right
        root.right = recursive(inorder, postorder, rootSuccessor, inEnd, rightPostStart, nextRootForRight);

        return root;
    }
}
