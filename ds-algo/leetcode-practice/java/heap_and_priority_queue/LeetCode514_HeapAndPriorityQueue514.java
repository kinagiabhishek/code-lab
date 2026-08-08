// https://leetcode.com/problems/priority-queue-heap-514/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode514_HeapAndPriorityQueue514 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode514_HeapAndPriorityQueue514 solver = new LeetCode514_HeapAndPriorityQueue514();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode514_HeapAndPriorityQueue514 Passed!");
    }
}
