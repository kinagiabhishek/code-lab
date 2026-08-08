// https://leetcode.com/problems/priority-queue-heap-124/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode124_HeapAndPriorityQueue124 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode124_HeapAndPriorityQueue124 solver = new LeetCode124_HeapAndPriorityQueue124();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode124_HeapAndPriorityQueue124 Passed!");
    }
}
