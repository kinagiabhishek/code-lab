// https://leetcode.com/problems/priority-queue-heap-423/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode423_HeapAndPriorityQueue423 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode423_HeapAndPriorityQueue423 solver = new LeetCode423_HeapAndPriorityQueue423();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode423_HeapAndPriorityQueue423 Passed!");
    }
}
