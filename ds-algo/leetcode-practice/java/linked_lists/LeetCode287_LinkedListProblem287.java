// https://leetcode.com/problems/problem-linkedlist-287/
package linked_lists;

import java.util.*;

public class LeetCode287_LinkedListProblem287 {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode solve(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) { ListNode next = curr.next; curr.next = prev; prev = curr; curr = next; }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        LeetCode287_LinkedListProblem287 solver = new LeetCode287_LinkedListProblem287();
        assert solver.solve(head).val == 2;
        System.out.println("✅ LeetCode287_LinkedListProblem287 Passed!");
    }
}
