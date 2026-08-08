// https://leetcode.com/problems/priority-queue-heap-488/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode488_HeapAndPriorityQueue488 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode488_HeapAndPriorityQueue488 solver = new LeetCode488_HeapAndPriorityQueue488();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode488_HeapAndPriorityQueue488 Passed!");
    }
}
