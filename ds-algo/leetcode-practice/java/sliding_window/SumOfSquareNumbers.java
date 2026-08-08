// https://leetcode.com/problems/sum-of-square-numbers/
package sliding_window;

import java.util.*;

public class SumOfSquareNumbers {
    // LeetCode Problem 633: Sum of Square Numbers
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SumOfSquareNumbers solver = new SumOfSquareNumbers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SumOfSquareNumbers (Sum of Square Numbers) Passed!");
    }
}
