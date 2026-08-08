// https://leetcode.com/problems/priority-queue-heap-59/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode59_HeapAndPriorityQueue59 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode59_HeapAndPriorityQueue59 solver = new LeetCode59_HeapAndPriorityQueue59();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode59_HeapAndPriorityQueue59 Passed!");
    }
}
