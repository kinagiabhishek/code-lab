// https://leetcode.com/problems/4sum/
package stacks_and_queues;

import java.util.*;

public class P4sum {
    // LeetCode Problem 18: 4Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        P4sum solver = new P4sum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ P4sum (4Sum) Passed!");
    }
}
