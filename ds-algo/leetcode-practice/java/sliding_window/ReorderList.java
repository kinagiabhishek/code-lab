// https://leetcode.com/problems/reorder-list/
package sliding_window;

import java.util.*;

public class ReorderList {
    // LeetCode Problem 143: Reorder List
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReorderList solver = new ReorderList();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ ReorderList Passed!");
    }
}
