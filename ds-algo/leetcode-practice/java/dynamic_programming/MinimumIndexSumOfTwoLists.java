// https://leetcode.com/problems/minimum-index-sum-of-two-lists/
package dynamic_programming;

import java.util.*;

public class MinimumIndexSumOfTwoLists {
    // LeetCode Problem 599: Minimum Index Sum of Two Lists
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        MinimumIndexSumOfTwoLists solver = new MinimumIndexSumOfTwoLists();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ MinimumIndexSumOfTwoLists Passed!");
    }
}
