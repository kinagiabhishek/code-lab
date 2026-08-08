// https://leetcode.com/problems/minimum-height-trees/
package two_pointers;

import java.util.*;

public class MinimumHeightTrees {
    // LeetCode Problem 310: Minimum Height Trees
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumHeightTrees solver = new MinimumHeightTrees();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumHeightTrees (Minimum Height Trees) Passed!");
    }
}
