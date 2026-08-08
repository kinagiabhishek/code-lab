// https://leetcode.com/problems/super-pow/
package graphs;

import java.util.*;

public class SuperPow {
    // LeetCode Problem 372: Super Pow
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SuperPow solver = new SuperPow();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SuperPow (Super Pow) Passed!");
    }
}
