// https://leetcode.com/problems/priority-queue-heap-189/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode189_HeapAndPriorityQueue189 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode189_HeapAndPriorityQueue189 solver = new LeetCode189_HeapAndPriorityQueue189();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode189_HeapAndPriorityQueue189 Passed!");
    }
}
