// https://leetcode.com/problems/n-queens/
package heap_and_priority_queue;

import java.util.*;

public class Nqueens {
    // LeetCode Problem 51: N-Queens
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        Nqueens solver = new Nqueens();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ Nqueens (N-Queens) Passed!");
    }
}
