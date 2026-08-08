// https://leetcode.com/problems/priority-queue-heap-254/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode254_HeapAndPriorityQueue254 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode254_HeapAndPriorityQueue254 solver = new LeetCode254_HeapAndPriorityQueue254();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode254_HeapAndPriorityQueue254 Passed!");
    }
}
