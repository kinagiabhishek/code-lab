package linked_lists;

/**
 * LeetCode 206: Reverse Linked List
 * Link: https://leetcode.com/problems/reverse-linked-list/
 * Difficulty: Easy
 */
public class LeetCode206_ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        LeetCode206_ReverseLinkedList solver = new LeetCode206_ReverseLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode reversed = solver.reverseList(head);
        assert reversed.val == 3;
        assert reversed.next.val == 2;
        assert reversed.next.next.val == 1;
        System.out.println("✅ ReverseLinkedList Test Passed!");
    }
}
