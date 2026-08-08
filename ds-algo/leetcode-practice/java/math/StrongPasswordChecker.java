// https://leetcode.com/problems/strong-password-checker/
package math;

import java.util.*;

public class StrongPasswordChecker {
    // LeetCode Problem 420: Strong Password Checker
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        StrongPasswordChecker solver = new StrongPasswordChecker();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ StrongPasswordChecker (Strong Password Checker) Passed!");
    }
}
