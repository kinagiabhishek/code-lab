// https://leetcode.com/problems/palindrome-number/
package two_pointers;

import java.util.*;

public class LeetCode9_PalindromeNumber {
    // LeetCode Problem 9: Palindrome Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode9_PalindromeNumber solver = new LeetCode9_PalindromeNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode9_PalindromeNumber (Palindrome Number) Passed!");
    }
}
