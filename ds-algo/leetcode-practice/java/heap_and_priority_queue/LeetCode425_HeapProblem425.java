// https://leetcode.com/problems/problem-heap-425/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode425_HeapProblem425 {
    public int solve(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) { pq.add(n); if (pq.size() > k) pq.poll(); }
        return pq.peek();
    }
    public static void main(String[] args) {
        LeetCode425_HeapProblem425 solver = new LeetCode425_HeapProblem425();
        assert solver.solve(new int[]{3,2,1,5,6,4}, 2) == 5;
        System.out.println("✅ LeetCode425_HeapProblem425 Passed!");
    }
}
