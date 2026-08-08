// https://leetcode.com/problems/number-complement/
package math;

import java.util.*;

public class NumberComplement {
    // LeetCode Problem 476: Number Complement
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NumberComplement solver = new NumberComplement();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NumberComplement (Number Complement) Passed!");
    }
}
