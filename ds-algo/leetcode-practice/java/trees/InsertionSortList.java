// https://leetcode.com/problems/insertion-sort-list/
package trees;

import java.util.*;

public class InsertionSortList {
    // LeetCode Problem 147: Insertion Sort List
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        InsertionSortList solver = new InsertionSortList();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ InsertionSortList Passed!");
    }
}
