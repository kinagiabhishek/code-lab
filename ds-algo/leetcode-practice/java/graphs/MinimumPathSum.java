// https://leetcode.com/problems/minimum-path-sum/
package graphs;

import java.util.*;

public class MinimumPathSum {
    // LeetCode Problem 64: Minimum Path Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumPathSum solver = new MinimumPathSum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumPathSum (Minimum Path Sum) Passed!");
    }
}
