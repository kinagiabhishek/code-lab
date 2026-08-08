// https://leetcode.com/problems/priority-queue-heap-293/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode293_HeapAndPriorityQueue293 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode293_HeapAndPriorityQueue293 solver = new LeetCode293_HeapAndPriorityQueue293();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode293_HeapAndPriorityQueue293 Passed!");
    }
}
