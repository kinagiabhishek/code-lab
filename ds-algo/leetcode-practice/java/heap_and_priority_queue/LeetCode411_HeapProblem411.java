// https://leetcode.com/problems/problem-heap-411/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode411_HeapProblem411 {
    public int solve(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) { pq.add(n); if (pq.size() > k) pq.poll(); }
        return pq.peek();
    }
    public static void main(String[] args) {
        LeetCode411_HeapProblem411 solver = new LeetCode411_HeapProblem411();
        assert solver.solve(new int[]{3,2,1,5,6,4}, 2) == 5;
        System.out.println("✅ LeetCode411_HeapProblem411 Passed!");
    }
}
