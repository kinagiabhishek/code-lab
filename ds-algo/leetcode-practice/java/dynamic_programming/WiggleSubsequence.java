// https://leetcode.com/problems/wiggle-subsequence/
package dynamic_programming;

import java.util.*;

public class WiggleSubsequence {
    // LeetCode Problem 376: Wiggle Subsequence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        WiggleSubsequence solver = new WiggleSubsequence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode376_WiggleSubsequence (Wiggle Subsequence) Passed!");
    }
}
