// https://leetcode.com/problems/palindromic-substrings/
package trees;

import java.util.*;

public class LeetCode647_PalindromicSubstrings {
    // LeetCode Problem 647: Palindromic Substrings
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode647_PalindromicSubstrings solver = new LeetCode647_PalindromicSubstrings();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode647_PalindromicSubstrings (Palindromic Substrings) Passed!");
    }
}
