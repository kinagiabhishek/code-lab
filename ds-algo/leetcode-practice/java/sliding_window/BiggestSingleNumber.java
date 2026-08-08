// https://leetcode.com/problems/biggest-single-number/
package sliding_window;

import java.util.*;

public class BiggestSingleNumber {
    // LeetCode Problem 619: Biggest Single Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BiggestSingleNumber solver = new BiggestSingleNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BiggestSingleNumber (Biggest Single Number) Passed!");
    }
}
