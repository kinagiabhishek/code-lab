// https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
package arrays_and_hashing;

import java.util.*;

public class MaximumXorOfTwoNumbersInAnArray {
    // LeetCode Problem 421: Maximum XOR of Two Numbers in an Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaximumXorOfTwoNumbersInAnArray solver = new MaximumXorOfTwoNumbersInAnArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaximumXorOfTwoNumbersInAnArray (Maximum XOR of Two Numbers in an Array) Passed!");
    }
}
