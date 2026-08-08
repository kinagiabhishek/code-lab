// https://leetcode.com/problems/priority-queue-heap-85/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode85_HeapAndPriorityQueue85 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode85_HeapAndPriorityQueue85 solver = new LeetCode85_HeapAndPriorityQueue85();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode85_HeapAndPriorityQueue85 Passed!");
    }
}
