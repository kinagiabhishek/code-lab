// https://leetcode.com/problems/priority-queue-heap-319/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode319_HeapAndPriorityQueue319 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode319_HeapAndPriorityQueue319 solver = new LeetCode319_HeapAndPriorityQueue319();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode319_HeapAndPriorityQueue319 Passed!");
    }
}
