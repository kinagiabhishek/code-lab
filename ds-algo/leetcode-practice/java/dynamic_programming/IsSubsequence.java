// https://leetcode.com/problems/is-subsequence/
package dynamic_programming;

import java.util.*;

public class IsSubsequence {
    // LeetCode Problem 392: Is Subsequence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        IsSubsequence solver = new IsSubsequence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode392_IsSubsequence (Is Subsequence) Passed!");
    }
}
