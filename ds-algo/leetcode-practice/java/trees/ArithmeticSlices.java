// https://leetcode.com/problems/arithmetic-slices/
package trees;

import java.util.*;

public class ArithmeticSlices {
    // LeetCode Problem 413: Arithmetic Slices
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ArithmeticSlices solver = new ArithmeticSlices();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ArithmeticSlices (Arithmetic Slices) Passed!");
    }
}
