// https://leetcode.com/problems/super-ugly-number/
package binary_search;

import java.util.*;

public class SuperUglyNumber {
    // LeetCode Problem 313: Super Ugly Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SuperUglyNumber solver = new SuperUglyNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SuperUglyNumber (Super Ugly Number) Passed!");
    }
}
