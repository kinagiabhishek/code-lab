// https://leetcode.com/problems/problem-linkedlist-258/
package linked_lists;

import java.util.*;

public class LeetCode258_LinkedListProblem258 {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode solve(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) { ListNode next = curr.next; curr.next = prev; prev = curr; curr = next; }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        LeetCode258_LinkedListProblem258 solver = new LeetCode258_LinkedListProblem258();
        assert solver.solve(head).val == 2;
        System.out.println("✅ LeetCode258_LinkedListProblem258 Passed!");
    }
}
