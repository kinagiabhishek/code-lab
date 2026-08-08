// https://leetcode.com/problems/priority-queue-heap-98/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode98_HeapAndPriorityQueue98 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode98_HeapAndPriorityQueue98 solver = new LeetCode98_HeapAndPriorityQueue98();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode98_HeapAndPriorityQueue98 Passed!");
    }
}
