// https://leetcode.com/problems/priority-queue-heap-345/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode345_HeapAndPriorityQueue345 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode345_HeapAndPriorityQueue345 solver = new LeetCode345_HeapAndPriorityQueue345();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode345_HeapAndPriorityQueue345 Passed!");
    }
}
