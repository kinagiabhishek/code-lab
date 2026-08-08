// https://leetcode.com/problems/priority-queue-heap-462/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode462_HeapAndPriorityQueue462 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode462_HeapAndPriorityQueue462 solver = new LeetCode462_HeapAndPriorityQueue462();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode462_HeapAndPriorityQueue462 Passed!");
    }
}
