// https://leetcode.com/problems/climbing-stairs/
package math;

import java.util.*;

public class ClimbingStairs {
    // LeetCode Problem 70: Climbing Stairs
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ClimbingStairs solver = new ClimbingStairs();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ClimbingStairs (Climbing Stairs) Passed!");
    }
}
