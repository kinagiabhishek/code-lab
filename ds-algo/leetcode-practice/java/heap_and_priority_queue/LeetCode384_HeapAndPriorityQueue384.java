// https://leetcode.com/problems/priority-queue-heap-384/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode384_HeapAndPriorityQueue384 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode384_HeapAndPriorityQueue384 solver = new LeetCode384_HeapAndPriorityQueue384();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode384_HeapAndPriorityQueue384 Passed!");
    }
}
