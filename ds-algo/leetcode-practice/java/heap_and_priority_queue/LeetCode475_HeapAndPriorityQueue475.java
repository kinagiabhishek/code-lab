// https://leetcode.com/problems/priority-queue-heap-475/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode475_HeapAndPriorityQueue475 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode475_HeapAndPriorityQueue475 solver = new LeetCode475_HeapAndPriorityQueue475();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode475_HeapAndPriorityQueue475 Passed!");
    }
}
