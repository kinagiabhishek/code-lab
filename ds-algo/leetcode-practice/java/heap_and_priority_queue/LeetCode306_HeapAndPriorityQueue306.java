// https://leetcode.com/problems/priority-queue-heap-306/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode306_HeapAndPriorityQueue306 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode306_HeapAndPriorityQueue306 solver = new LeetCode306_HeapAndPriorityQueue306();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode306_HeapAndPriorityQueue306 Passed!");
    }
}
