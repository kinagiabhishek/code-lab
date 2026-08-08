// https://leetcode.com/problems/problem-linkedlist-275/
package linked_lists;

import java.util.*;

public class LeetCode275_LinkedListProblem275 {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode solve(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) { ListNode next = curr.next; curr.next = prev; prev = curr; curr = next; }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        LeetCode275_LinkedListProblem275 solver = new LeetCode275_LinkedListProblem275();
        assert solver.solve(head).val == 2;
        System.out.println("✅ LeetCode275_LinkedListProblem275 Passed!");
    }
}
