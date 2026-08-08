// https://leetcode.com/problems/priority-queue-heap-202/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode202_HeapAndPriorityQueue202 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode202_HeapAndPriorityQueue202 solver = new LeetCode202_HeapAndPriorityQueue202();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode202_HeapAndPriorityQueue202 Passed!");
    }
}
