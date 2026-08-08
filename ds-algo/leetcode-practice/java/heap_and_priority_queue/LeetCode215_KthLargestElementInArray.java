// https://leetcode.com/problems/kth-largest-element-in-an-array/
package heap_and_priority_queue;
import java.util.PriorityQueue;

public class LeetCode215_KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        LeetCode215_KthLargestElementInArray solver = new LeetCode215_KthLargestElementInArray();
        assert solver.findKthLargest(new int[]{3,2,1,5,6,4}, 2) == 5;
        System.out.println("✅ LeetCode215_KthLargestElementInArray Passed!");
    }
}
