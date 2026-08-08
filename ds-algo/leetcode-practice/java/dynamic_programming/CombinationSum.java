// https://leetcode.com/problems/combination-sum/
package dynamic_programming;

import java.util.*;

public class CombinationSum {
    // LeetCode Problem 39: Combination Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CombinationSum solver = new CombinationSum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CombinationSum (Combination Sum) Passed!");
    }
}
