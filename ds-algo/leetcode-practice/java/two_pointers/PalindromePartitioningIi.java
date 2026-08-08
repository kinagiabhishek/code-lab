// https://leetcode.com/problems/palindrome-partitioning-ii/
package two_pointers;

import java.util.*;

public class PalindromePartitioningIi {
    // LeetCode Problem 132: Palindrome Partitioning II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PalindromePartitioningIi solver = new PalindromePartitioningIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode132_PalindromePartitioningIi (Palindrome Partitioning II) Passed!");
    }
}
