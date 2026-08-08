// https://leetcode.com/problems/add-two-numbers/
package linked_lists;
public class LeetCode2_AddTwoNumbers {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), p = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2); l1.next = new ListNode(4); l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5); l2.next = new ListNode(6); l2.next.next = new ListNode(4);
        assert new LeetCode2_AddTwoNumbers().addTwoNumbers(l1, l2).val == 7;
        System.out.println("✅ LeetCode2_AddTwoNumbers Passed!");
    }
}
