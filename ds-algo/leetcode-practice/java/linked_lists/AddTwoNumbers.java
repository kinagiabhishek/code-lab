// https://leetcode.com/problems/add-two-numbers/
package linked_lists;

import java.util.*;

public class AddTwoNumbers {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), p = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            carry = sum / 10; p.next = new ListNode(sum % 10); p = p.next;
            if (l1 != null) l1 = l1.next; if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
}
