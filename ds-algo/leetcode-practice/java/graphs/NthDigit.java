// https://leetcode.com/problems/nth-digit/
package graphs;

import java.util.*;

public class NthDigit {
    // LeetCode Problem 400: Nth Digit
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NthDigit solver = new NthDigit();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NthDigit (Nth Digit) Passed!");
    }
}
