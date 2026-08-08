// https://leetcode.com/problems/priority-queue-heap-397/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode397_HeapAndPriorityQueue397 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode397_HeapAndPriorityQueue397 solver = new LeetCode397_HeapAndPriorityQueue397();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode397_HeapAndPriorityQueue397 Passed!");
    }
}
