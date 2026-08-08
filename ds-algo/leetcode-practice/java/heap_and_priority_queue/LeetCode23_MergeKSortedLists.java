// https://leetcode.com/problems/merge-k-sorted-lists/
package heap_and_priority_queue;
import java.util.PriorityQueue;
public class LeetCode23_MergeKSortedLists {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode node : lists) if (node != null) pq.add(node);
        ListNode dummy = new ListNode(0), tail = dummy;
        while (!pq.isEmpty()) { ListNode node = pq.poll(); tail.next = node; tail = tail.next; if (node.next != null) pq.add(node.next); }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1); l1.next = new ListNode(4);
        ListNode l2 = new ListNode(2); l2.next = new ListNode(3);
        assert new LeetCode23_MergeKSortedLists().mergeKLists(new ListNode[]{l1, l2}).val == 1;
        System.out.println("✅ LeetCode23_MergeKSortedLists Passed!");
    }
}
