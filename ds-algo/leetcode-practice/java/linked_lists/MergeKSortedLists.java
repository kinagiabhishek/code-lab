// https://leetcode.com/problems/merge-k-sorted-lists/
package linked_lists;

import java.util.*;

public class MergeKSortedLists {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode node : lists) if (node != null) pq.add(node);
        ListNode dummy = new ListNode(0), tail = dummy;
        while (!pq.isEmpty()) { ListNode node = pq.poll(); tail.next = node; tail = tail.next; if (node.next != null) pq.add(node.next); }
        return dummy.next;
    }
}
