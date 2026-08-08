// https://leetcode.com/problems/problem-heap-422/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode422_HeapProblem422 {
    public int solve(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) { pq.add(n); if (pq.size() > k) pq.poll(); }
        return pq.peek();
    }
    public static void main(String[] args) {
        LeetCode422_HeapProblem422 solver = new LeetCode422_HeapProblem422();
        assert solver.solve(new int[]{3,2,1,5,6,4}, 2) == 5;
        System.out.println("✅ LeetCode422_HeapProblem422 Passed!");
    }
}
