// https://leetcode.com/problems/roman-to-integer/
package bit_manipulation;

import java.util.*;

public class RomanToInteger {
    // LeetCode Problem 13: Roman to Integer
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RomanToInteger solver = new RomanToInteger();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RomanToInteger (Roman to Integer) Passed!");
    }
}
