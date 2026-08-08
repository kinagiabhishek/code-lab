package linked_lists;
public class LeetCode19_RemoveNthNodeFromEnd {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        for (int i = 0; i <= n; i++) fast = fast.next;
        while (fast != null) { fast = fast.next; slow = slow.next; }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1); head.next = new ListNode(2); head.next.next = new ListNode(3);
        assert new LeetCode19_RemoveNthNodeFromEnd().removeNthFromEnd(head, 1).next.val == 2;
        System.out.println("✅ LeetCode19_RemoveNthNodeFromEnd Passed!");
    }
}
