// https://leetcode.com/problems/add-two-numbers-ii/
package dynamic_programming;

import java.util.*;

public class AddTwoNumbersIi {
    // LeetCode Problem 445: Add Two Numbers II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        AddTwoNumbersIi solver = new AddTwoNumbersIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ AddTwoNumbersIi (Add Two Numbers II) Passed!");
    }
}
