// https://leetcode.com/problems/priority-queue-heap-241/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode241_HeapAndPriorityQueue241 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode241_HeapAndPriorityQueue241 solver = new LeetCode241_HeapAndPriorityQueue241();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode241_HeapAndPriorityQueue241 Passed!");
    }
}
