// https://leetcode.com/problems/linked-list-cycle/
package linked_lists;
public class LeetCode141_LinkedListCycle {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head, fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next; fast = fast.next.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3); head.next = new ListNode(2); head.next.next = head;
        assert new LeetCode141_LinkedListCycle().hasCycle(head) == true;
        System.out.println("✅ LeetCode141_LinkedListCycle Passed!");
    }
}
