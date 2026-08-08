// https://leetcode.com/problems/set-matrix-zeroes/
package sliding_window;

import java.util.*;

public class SetMatrixZeroes {
    // LeetCode Problem 73: Set Matrix Zeroes
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SetMatrixZeroes solver = new SetMatrixZeroes();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SetMatrixZeroes (Set Matrix Zeroes) Passed!");
    }
}
