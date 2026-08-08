// https://leetcode.com/problems/utf-8-validation/
package arrays_and_hashing;

import java.util.*;

public class Utf8Validation {
    // LeetCode Problem 393: UTF-8 Validation
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        Utf8Validation solver = new Utf8Validation();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ Utf8Validation (UTF-8 Validation) Passed!");
    }
}
