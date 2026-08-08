// https://leetcode.com/problems/problem-heap-403/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode403_HeapProblem403 {
    public int solve(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) { pq.add(n); if (pq.size() > k) pq.poll(); }
        return pq.peek();
    }
    public static void main(String[] args) {
        LeetCode403_HeapProblem403 solver = new LeetCode403_HeapProblem403();
        assert solver.solve(new int[]{3,2,1,5,6,4}, 2) == 5;
        System.out.println("✅ LeetCode403_HeapProblem403 Passed!");
    }
}
