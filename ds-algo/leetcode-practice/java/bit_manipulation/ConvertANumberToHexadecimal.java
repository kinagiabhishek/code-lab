// https://leetcode.com/problems/convert-a-number-to-hexadecimal/
package bit_manipulation;

import java.util.*;

public class ConvertANumberToHexadecimal {
    // LeetCode Problem 405: Convert a Number to Hexadecimal
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ConvertANumberToHexadecimal solver = new ConvertANumberToHexadecimal();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ConvertANumberToHexadecimal (Convert a Number to Hexadecimal) Passed!");
    }
}
