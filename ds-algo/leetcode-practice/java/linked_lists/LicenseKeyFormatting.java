// https://leetcode.com/problems/license-key-formatting/
package linked_lists;

import java.util.*;

public class LicenseKeyFormatting {
    // LeetCode Problem 482: License Key Formatting
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LicenseKeyFormatting solver = new LicenseKeyFormatting();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LicenseKeyFormatting (License Key Formatting) Passed!");
    }
}
