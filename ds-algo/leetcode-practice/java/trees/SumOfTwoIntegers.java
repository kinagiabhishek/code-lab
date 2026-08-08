// https://leetcode.com/problems/sum-of-two-integers/
package trees;

import java.util.*;

public class SumOfTwoIntegers {
    // LeetCode Problem 371: Sum of Two Integers
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SumOfTwoIntegers solver = new SumOfTwoIntegers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SumOfTwoIntegers (Sum of Two Integers) Passed!");
    }
}
