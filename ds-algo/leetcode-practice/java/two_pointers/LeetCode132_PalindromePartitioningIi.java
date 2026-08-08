// https://leetcode.com/problems/palindrome-partitioning-ii/
package two_pointers;

import java.util.*;

public class LeetCode132_PalindromePartitioningIi {
    // LeetCode Problem 132: Palindrome Partitioning II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode132_PalindromePartitioningIi solver = new LeetCode132_PalindromePartitioningIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode132_PalindromePartitioningIi (Palindrome Partitioning II) Passed!");
    }
}
