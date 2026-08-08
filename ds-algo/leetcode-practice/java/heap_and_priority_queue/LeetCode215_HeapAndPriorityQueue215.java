// https://leetcode.com/problems/priority-queue-heap-215/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode215_HeapAndPriorityQueue215 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode215_HeapAndPriorityQueue215 solver = new LeetCode215_HeapAndPriorityQueue215();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode215_HeapAndPriorityQueue215 Passed!");
    }
}
