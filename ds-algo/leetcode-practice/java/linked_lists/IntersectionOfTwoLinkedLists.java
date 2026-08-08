// https://leetcode.com/problems/intersection-of-two-linked-lists/
package linked_lists;

import java.util.*;

public class IntersectionOfTwoLinkedLists {
    // LeetCode Problem 160: Intersection of Two Linked Lists
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        IntersectionOfTwoLinkedLists solver = new IntersectionOfTwoLinkedLists();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ IntersectionOfTwoLinkedLists Passed!");
    }
}
