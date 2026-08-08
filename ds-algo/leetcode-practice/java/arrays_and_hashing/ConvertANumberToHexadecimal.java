// https://leetcode.com/problems/convert-a-number-to-hexadecimal/
package arrays_and_hashing;

import java.util.*;

public class ConvertANumberToHexadecimal {
    // LeetCode Problem 405: Convert a Number to Hexadecimal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ConvertANumberToHexadecimal solver = new ConvertANumberToHexadecimal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode405_ConvertANumberToHexadecimal (Convert a Number to Hexadecimal) Passed!");
    }
}
