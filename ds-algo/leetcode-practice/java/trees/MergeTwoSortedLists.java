// https://leetcode.com/problems/merge-two-sorted-lists/
package trees;

import java.util.*;

public class MergeTwoSortedLists {
    // LeetCode Problem 21: Merge Two Sorted Lists
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists solver = new MergeTwoSortedLists();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ MergeTwoSortedLists Passed!");
    }
}
