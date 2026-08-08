// https://leetcode.com/problems/priority-queue-heap-267/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode267_HeapAndPriorityQueue267 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode267_HeapAndPriorityQueue267 solver = new LeetCode267_HeapAndPriorityQueue267();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode267_HeapAndPriorityQueue267 Passed!");
    }
}
