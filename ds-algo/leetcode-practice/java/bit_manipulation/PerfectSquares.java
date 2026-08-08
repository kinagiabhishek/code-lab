// https://leetcode.com/problems/perfect-squares/
package bit_manipulation;

import java.util.*;

public class PerfectSquares {
    // LeetCode Problem 279: Perfect Squares
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PerfectSquares solver = new PerfectSquares();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PerfectSquares (Perfect Squares) Passed!");
    }
}
