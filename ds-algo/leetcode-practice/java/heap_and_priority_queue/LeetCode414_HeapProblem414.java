// https://leetcode.com/problems/problem-heap-414/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode414_HeapProblem414 {
    public int solve(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) { pq.add(n); if (pq.size() > k) pq.poll(); }
        return pq.peek();
    }
    public static void main(String[] args) {
        LeetCode414_HeapProblem414 solver = new LeetCode414_HeapProblem414();
        assert solver.solve(new int[]{3,2,1,5,6,4}, 2) == 5;
        System.out.println("✅ LeetCode414_HeapProblem414 Passed!");
    }
}
