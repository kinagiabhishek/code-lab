// https://leetcode.com/problems/problem-heap-413/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode413_HeapProblem413 {
    public int solve(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) { pq.add(n); if (pq.size() > k) pq.poll(); }
        return pq.peek();
    }
    public static void main(String[] args) {
        LeetCode413_HeapProblem413 solver = new LeetCode413_HeapProblem413();
        assert solver.solve(new int[]{3,2,1,5,6,4}, 2) == 5;
        System.out.println("✅ LeetCode413_HeapProblem413 Passed!");
    }
}
