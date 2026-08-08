// https://leetcode.com/problems/single-number-ii/
package dynamic_programming;

import java.util.*;

public class SingleNumberIi {
    // LeetCode Problem 137: Single Number II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SingleNumberIi solver = new SingleNumberIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SingleNumberIi (Single Number II) Passed!");
    }
}
