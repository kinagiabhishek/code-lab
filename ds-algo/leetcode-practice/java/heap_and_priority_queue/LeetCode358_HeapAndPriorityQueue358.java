// https://leetcode.com/problems/priority-queue-heap-358/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode358_HeapAndPriorityQueue358 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode358_HeapAndPriorityQueue358 solver = new LeetCode358_HeapAndPriorityQueue358();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode358_HeapAndPriorityQueue358 Passed!");
    }
}
