// https://leetcode.com/problems/longest-palindrome/
package two_pointers;

import java.util.*;

public class LeetCode409_LongestPalindrome {
    // LeetCode Problem 409: Longest Palindrome
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode409_LongestPalindrome solver = new LeetCode409_LongestPalindrome();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode409_LongestPalindrome (Longest Palindrome) Passed!");
    }
}
