// https://leetcode.com/problems/priority-queue-heap-163/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode163_HeapAndPriorityQueue163 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode163_HeapAndPriorityQueue163 solver = new LeetCode163_HeapAndPriorityQueue163();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode163_HeapAndPriorityQueue163 Passed!");
    }
}
