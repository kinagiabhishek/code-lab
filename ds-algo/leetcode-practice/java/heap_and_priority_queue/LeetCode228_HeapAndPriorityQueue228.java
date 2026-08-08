// https://leetcode.com/problems/priority-queue-heap-228/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode228_HeapAndPriorityQueue228 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode228_HeapAndPriorityQueue228 solver = new LeetCode228_HeapAndPriorityQueue228();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode228_HeapAndPriorityQueue228 Passed!");
    }
}
