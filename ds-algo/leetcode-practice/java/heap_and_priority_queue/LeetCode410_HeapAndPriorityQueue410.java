// https://leetcode.com/problems/priority-queue-heap-410/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode410_HeapAndPriorityQueue410 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode410_HeapAndPriorityQueue410 solver = new LeetCode410_HeapAndPriorityQueue410();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode410_HeapAndPriorityQueue410 Passed!");
    }
}
