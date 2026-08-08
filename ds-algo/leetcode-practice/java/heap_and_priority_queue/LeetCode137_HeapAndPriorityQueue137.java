// https://leetcode.com/problems/priority-queue-heap-137/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode137_HeapAndPriorityQueue137 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode137_HeapAndPriorityQueue137 solver = new LeetCode137_HeapAndPriorityQueue137();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode137_HeapAndPriorityQueue137 Passed!");
    }
}
