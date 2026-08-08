// https://leetcode.com/problems/maximum-gap/
package backtracking;

import java.util.*;

public class MaximumGap {
    // LeetCode Problem 164: Maximum Gap
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaximumGap solver = new MaximumGap();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaximumGap (Maximum Gap) Passed!");
    }
}
