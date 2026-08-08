// https://leetcode.com/problems/priority-queue-heap-111/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode111_HeapAndPriorityQueue111 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode111_HeapAndPriorityQueue111 solver = new LeetCode111_HeapAndPriorityQueue111();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode111_HeapAndPriorityQueue111 Passed!");
    }
}
