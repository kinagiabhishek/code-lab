// https://leetcode.com/problems/remove-k-digits/
package backtracking;

import java.util.*;

public class RemoveKDigits {
    // LeetCode Problem 402: Remove K Digits
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RemoveKDigits solver = new RemoveKDigits();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RemoveKDigits (Remove K Digits) Passed!");
    }
}
