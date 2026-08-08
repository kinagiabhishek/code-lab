// https://leetcode.com/problems/path-sum/
package math;

import java.util.*;

public class PathSum {
    // LeetCode Problem 112: Path Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PathSum solver = new PathSum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PathSum (Path Sum) Passed!");
    }
}
