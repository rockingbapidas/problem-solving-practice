package tree;

import java.util.Stack;

public class BuildFromPreOrderToInOrder {
    public TreeNode iterative(int[] preorder, int[] inorder) {
        if (preorder.length == 0)
            return null;

        int prePosition = 0;
        int inPosition = 0;
        int flag = 0;

        TreeNode temp = new TreeNode(preorder[prePosition++]);
        System.out.print(temp.val);
        TreeNode root = temp;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(temp);

        while (prePosition < preorder.length) {
            if (!stack.isEmpty() && stack.peek().val == inorder[inPosition]) {
                flag = 1;
                temp = stack.pop();
                inPosition++;
            } else {
                if (flag == 0) {
                    temp.left = new TreeNode(preorder[prePosition++]);
                    temp = temp.left;
                } else {
                    flag = 0;
                    temp.right = new TreeNode(preorder[prePosition++]);
                    temp = temp.right;
                }
                System.out.print(temp.val);
                stack.push(temp);
            }
        }
        return root;
    }

    public TreeNode recursive(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
        if (preStart > preorder.length - 1 || inStart > inEnd)
            return null;

        int rootValue = preorder[preStart];
        System.out.print(rootValue);
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

        int nextRootForLeft = preStart + 1; // next root element for left
        int nextRootForRight = preStart + rootIndex - inStart + 1; // next root element for right

        // for left
        root.left = recursive(preorder, inorder, nextRootForLeft, inStart, rootPredecessor);

        // for right
        root.right = recursive(preorder, inorder, nextRootForRight, rootSuccessor, inEnd);

        return root;
    }
}
