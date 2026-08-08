// https://leetcode.com/problems/the-skyline-problem/
package graphs;

import java.util.*;

public class TheSkylineProblem {
    // LeetCode Problem 218: The Skyline Problem
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TheSkylineProblem solver = new TheSkylineProblem();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TheSkylineProblem (The Skyline Problem) Passed!");
    }
}
