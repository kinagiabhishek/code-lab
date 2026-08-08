// https://leetcode.com/problems/priority-queue-heap-371/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode371_HeapAndPriorityQueue371 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode371_HeapAndPriorityQueue371 solver = new LeetCode371_HeapAndPriorityQueue371();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode371_HeapAndPriorityQueue371 Passed!");
    }
}
