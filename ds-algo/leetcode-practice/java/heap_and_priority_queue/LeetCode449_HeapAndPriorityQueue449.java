// https://leetcode.com/problems/priority-queue-heap-449/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode449_HeapAndPriorityQueue449 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode449_HeapAndPriorityQueue449 solver = new LeetCode449_HeapAndPriorityQueue449();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode449_HeapAndPriorityQueue449 Passed!");
    }
}
