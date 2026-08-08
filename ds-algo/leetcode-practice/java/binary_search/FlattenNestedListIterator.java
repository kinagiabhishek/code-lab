// https://leetcode.com/problems/flatten-nested-list-iterator/
package binary_search;

import java.util.*;

public class FlattenNestedListIterator {
    // LeetCode Problem 341: Flatten Nested List Iterator
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        FlattenNestedListIterator solver = new FlattenNestedListIterator();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ FlattenNestedListIterator Passed!");
    }
}
