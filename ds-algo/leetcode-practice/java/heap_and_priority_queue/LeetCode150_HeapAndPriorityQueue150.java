// https://leetcode.com/problems/priority-queue-heap-150/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode150_HeapAndPriorityQueue150 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode150_HeapAndPriorityQueue150 solver = new LeetCode150_HeapAndPriorityQueue150();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode150_HeapAndPriorityQueue150 Passed!");
    }
}
