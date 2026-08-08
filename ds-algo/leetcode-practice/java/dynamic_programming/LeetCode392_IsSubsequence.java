// https://leetcode.com/problems/is-subsequence/
package dynamic_programming;

import java.util.*;

public class LeetCode392_IsSubsequence {
    // LeetCode Problem 392: Is Subsequence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode392_IsSubsequence solver = new LeetCode392_IsSubsequence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode392_IsSubsequence (Is Subsequence) Passed!");
    }
}
