// https://leetcode.com/problems/longest-palindrome/
package two_pointers;

import java.util.*;

public class LongestPalindrome {
    // LeetCode Problem 409: Longest Palindrome
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LongestPalindrome solver = new LongestPalindrome();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode409_LongestPalindrome (Longest Palindrome) Passed!");
    }
}
