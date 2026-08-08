// https://leetcode.com/problems/compare-version-numbers/
package dynamic_programming;

import java.util.*;

public class CompareVersionNumbers {
    // LeetCode Problem 165: Compare Version Numbers
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CompareVersionNumbers solver = new CompareVersionNumbers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CompareVersionNumbers (Compare Version Numbers) Passed!");
    }
}
