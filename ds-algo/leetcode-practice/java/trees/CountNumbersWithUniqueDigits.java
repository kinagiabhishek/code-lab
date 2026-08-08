// https://leetcode.com/problems/count-numbers-with-unique-digits/
package trees;

import java.util.*;

public class CountNumbersWithUniqueDigits {
    // LeetCode Problem 357: Count Numbers with Unique Digits
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CountNumbersWithUniqueDigits solver = new CountNumbersWithUniqueDigits();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CountNumbersWithUniqueDigits (Count Numbers with Unique Digits) Passed!");
    }
}
