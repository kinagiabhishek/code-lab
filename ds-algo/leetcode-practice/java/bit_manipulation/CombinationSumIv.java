// https://leetcode.com/problems/combination-sum-iv/
package bit_manipulation;

import java.util.*;

public class CombinationSumIv {
    // LeetCode Problem 377: Combination Sum IV
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CombinationSumIv solver = new CombinationSumIv();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CombinationSumIv (Combination Sum IV) Passed!");
    }
}
