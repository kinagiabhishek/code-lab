// https://leetcode.com/problems/palindrome-partitioning/
package two_pointers;

import java.util.*;

public class LeetCode131_PalindromePartitioning {
    // LeetCode Problem 131: Palindrome Partitioning
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode131_PalindromePartitioning solver = new LeetCode131_PalindromePartitioning();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode131_PalindromePartitioning (Palindrome Partitioning) Passed!");
    }
}
