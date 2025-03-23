package linkedlist;

import linkedlist.data.SingleLinkedList;

public class SwapNodesInPairs {

    /**
     * Given a linked list, swap every two adjacent nodes and return its head.
     * You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
     * <p>
     * Example 1:
     * Input: head = [1,2,3,4]
     * Output: [2,1,4,3]
     * <p>
     * Example 2:
     * Input: head = []
     * Output: []
     * <p>
     * Example 3:
     * Input: head = [1]
     * Output: [1]
     * <p>
     * Constraints:
     * The number of nodes in the list is in the range [0, 100].
     * 0 <= Node.val <= 100
     *
     * @param head [SingleLinkedList] head of the linked list
     * @return [SingleLinkedList] head of the linked list after swapping every two adjacent nodes
     * <p>
     * Solution: Recursion
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public SingleLinkedList swapPairs(SingleLinkedList head) {
        if (head == null || head.next == null) {
            return head;
        }

        SingleLinkedList secondNode = head.next;

        head.next = swapPairs(secondNode.next);

        secondNode.next = head;

        return secondNode;
    }
}
