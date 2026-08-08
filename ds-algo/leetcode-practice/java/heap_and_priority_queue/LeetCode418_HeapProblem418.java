// https://leetcode.com/problems/problem-heap-418/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode418_HeapProblem418 {
    public int solve(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) { pq.add(n); if (pq.size() > k) pq.poll(); }
        return pq.peek();
    }
    public static void main(String[] args) {
        LeetCode418_HeapProblem418 solver = new LeetCode418_HeapProblem418();
        assert solver.solve(new int[]{3,2,1,5,6,4}, 2) == 5;
        System.out.println("✅ LeetCode418_HeapProblem418 Passed!");
    }
}
