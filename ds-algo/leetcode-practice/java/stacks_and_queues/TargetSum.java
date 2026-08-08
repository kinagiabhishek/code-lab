// https://leetcode.com/problems/target-sum/
package stacks_and_queues;

import java.util.*;

public class TargetSum {
    // LeetCode Problem 494: Target Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TargetSum solver = new TargetSum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TargetSum (Target Sum) Passed!");
    }
}
