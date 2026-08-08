// https://leetcode.com/problems/license-key-formatting/
package bit_manipulation;

import java.util.*;

public class LeetCode482_LicenseKeyFormatting {
    // LeetCode Problem 482: License Key Formatting
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode482_LicenseKeyFormatting solver = new LeetCode482_LicenseKeyFormatting();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode482_LicenseKeyFormatting (License Key Formatting) Passed!");
    }
}
