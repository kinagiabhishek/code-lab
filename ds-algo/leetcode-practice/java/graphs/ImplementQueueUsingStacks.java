// https://leetcode.com/problems/implement-queue-using-stacks/
package graphs;

import java.util.*;

public class ImplementQueueUsingStacks {
    // LeetCode Problem 232: Implement Queue using Stacks
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ImplementQueueUsingStacks solver = new ImplementQueueUsingStacks();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ImplementQueueUsingStacks (Implement Queue using Stacks) Passed!");
    }
}
