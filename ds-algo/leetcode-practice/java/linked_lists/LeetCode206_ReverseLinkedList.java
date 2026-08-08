// https://leetcode.com/problems/reverse-linked-list/
package linked_lists;
public class LeetCode206_ReverseLinkedList {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) { ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp; }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        assert new LeetCode206_ReverseLinkedList().reverseList(head).val == 2;
        System.out.println("✅ LeetCode206_ReverseLinkedList Passed!");
    }
}
