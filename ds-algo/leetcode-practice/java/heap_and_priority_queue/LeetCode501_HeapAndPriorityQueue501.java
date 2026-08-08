// https://leetcode.com/problems/priority-queue-heap-501/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode501_HeapAndPriorityQueue501 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode501_HeapAndPriorityQueue501 solver = new LeetCode501_HeapAndPriorityQueue501();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode501_HeapAndPriorityQueue501 Passed!");
    }
}
