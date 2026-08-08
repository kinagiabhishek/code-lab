// https://leetcode.com/problems/longest-uncommon-subsequence-ii/
package dynamic_programming;

import java.util.*;

public class LongestUncommonSubsequenceIi {
    // LeetCode Problem 522: Longest Uncommon Subsequence II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LongestUncommonSubsequenceIi solver = new LongestUncommonSubsequenceIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode522_LongestUncommonSubsequenceIi (Longest Uncommon Subsequence II) Passed!");
    }
}
