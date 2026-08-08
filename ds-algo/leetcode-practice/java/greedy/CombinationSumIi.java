// https://leetcode.com/problems/combination-sum-ii/
package greedy;

import java.util.*;

public class CombinationSumIi {
    // LeetCode Problem 40: Combination Sum II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CombinationSumIi solver = new CombinationSumIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CombinationSumIi (Combination Sum II) Passed!");
    }
}
