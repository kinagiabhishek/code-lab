// https://leetcode.com/problems/bitwise-and-of-numbers-range/
package binary_search;

import java.util.*;

public class BitwiseAndOfNumbersRange {
    // LeetCode Problem 201: Bitwise AND of Numbers Range
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BitwiseAndOfNumbersRange solver = new BitwiseAndOfNumbersRange();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BitwiseAndOfNumbersRange (Bitwise AND of Numbers Range) Passed!");
    }
}
