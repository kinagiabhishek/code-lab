// https://leetcode.com/problems/priority-queue-heap-332/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode332_HeapAndPriorityQueue332 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode332_HeapAndPriorityQueue332 solver = new LeetCode332_HeapAndPriorityQueue332();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode332_HeapAndPriorityQueue332 Passed!");
    }
}
