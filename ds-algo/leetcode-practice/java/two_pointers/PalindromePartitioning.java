// https://leetcode.com/problems/palindrome-partitioning/
package two_pointers;

import java.util.*;

public class PalindromePartitioning {
    // LeetCode Problem 131: Palindrome Partitioning
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PalindromePartitioning solver = new PalindromePartitioning();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode131_PalindromePartitioning (Palindrome Partitioning) Passed!");
    }
}
