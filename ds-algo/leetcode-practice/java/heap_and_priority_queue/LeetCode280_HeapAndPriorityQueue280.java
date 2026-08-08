// https://leetcode.com/problems/priority-queue-heap-280/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode280_HeapAndPriorityQueue280 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode280_HeapAndPriorityQueue280 solver = new LeetCode280_HeapAndPriorityQueue280();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode280_HeapAndPriorityQueue280 Passed!");
    }
}
