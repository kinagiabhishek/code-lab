package hard;

import java.util.PriorityQueue;

/**
 * LeetCode 23: Merge k Sorted Lists
 * Link: https://leetcode.com/problems/merge-k-sorted-lists/
 * Difficulty: Hard
 */
public class MergeKSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode node : lists) {
            if (node != null) pq.add(node);
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            tail.next = node;
            tail = tail.next;
            if (node.next != null) pq.add(node.next);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeKSortedLists solver = new MergeKSortedLists();
        ListNode l1 = new ListNode(1); l1.next = new ListNode(4); l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1); l2.next = new ListNode(3); l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2); l3.next = new ListNode(6);
        ListNode[] lists = new ListNode[] {l1, l2, l3};

        ListNode merged = solver.mergeKLists(lists);
        assert merged.val == 1;
        System.out.println("✅ MergeKSortedLists Test Passed!");
    }
}
