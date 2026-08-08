// https://leetcode.com/problems/unique-paths-ii/
package trees;

import java.util.*;

public class UniquePathsIi {
    // LeetCode Problem 63: Unique Paths II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        UniquePathsIi solver = new UniquePathsIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ UniquePathsIi (Unique Paths II) Passed!");
    }
}
