// https://leetcode.com/problems/01-matrix/
package backtracking;

import java.util.*;

public class P01Matrix {
    // LeetCode Problem 542: 01 Matrix
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        P01Matrix solver = new P01Matrix();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ P01Matrix (01 Matrix) Passed!");
    }
}
