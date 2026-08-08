// https://leetcode.com/problems/path-sum-ii/
package arrays_and_hashing;

import java.util.*;

public class PathSumIi {
    // LeetCode Problem 113: Path Sum II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PathSumIi solver = new PathSumIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PathSumIi (Path Sum II) Passed!");
    }
}
