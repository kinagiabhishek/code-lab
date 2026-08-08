package linked_lists;
public class LeetCode143_ReorderList {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) { slow = slow.next; fast = fast.next.next; }
        ListNode prev = null, curr = slow.next;
        slow.next = null;
        while (curr != null) { ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp; }
        ListNode p1 = head, p2 = prev;
        while (p2 != null) {
            ListNode t1 = p1.next, t2 = p2.next;
            p1.next = p2; p2.next = t1; p1 = t1; p2 = t2;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1); head.next = new ListNode(2); head.next.next = new ListNode(3); head.next.next.next = new ListNode(4);
        new LeetCode143_ReorderList().reorderList(head);
        assert head.next.val == 4;
        System.out.println("✅ LeetCode143_ReorderList Passed!");
    }
}
