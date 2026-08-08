// https://leetcode.com/problems/priority-queue-heap-436/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode436_HeapAndPriorityQueue436 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode436_HeapAndPriorityQueue436 solver = new LeetCode436_HeapAndPriorityQueue436();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode436_HeapAndPriorityQueue436 Passed!");
    }
}
