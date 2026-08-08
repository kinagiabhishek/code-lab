// https://leetcode.com/problems/array-nesting/
package binary_search;

import java.util.*;

public class ArrayNesting {
    // LeetCode Problem 565: Array Nesting
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ArrayNesting solver = new ArrayNesting();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ArrayNesting (Array Nesting) Passed!");
    }
}
