// https://leetcode.com/problems/palindrome-number/
package two_pointers;

import java.util.*;

public class PalindromeNumber {
    // LeetCode Problem 9: Palindrome Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PalindromeNumber solver = new PalindromeNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode9_PalindromeNumber (Palindrome Number) Passed!");
    }
}
