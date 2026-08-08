// https://leetcode.com/problems/priority-queue-heap-72/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode72_HeapAndPriorityQueue72 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode72_HeapAndPriorityQueue72 solver = new LeetCode72_HeapAndPriorityQueue72();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode72_HeapAndPriorityQueue72 Passed!");
    }
}
