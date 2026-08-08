// https://leetcode.com/problems/kth-largest-element-in-an-array/
package heap_and_priority_queue;
import java.util.PriorityQueue;
public class LeetCode215_KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) { pq.add(num); if (pq.size() > k) pq.poll(); }
        return pq.peek();
    }
    public static void main(String[] args) {
        assert new LeetCode215_KthLargestElementInArray().findKthLargest(new int[]{3,2,1,5,6,4}, 2) == 5;
        System.out.println("✅ LeetCode215_KthLargestElementInArray Passed!");
    }
}
