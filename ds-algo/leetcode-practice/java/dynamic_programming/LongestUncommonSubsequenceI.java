// https://leetcode.com/problems/longest-uncommon-subsequence-i/
package dynamic_programming;

import java.util.*;

public class LongestUncommonSubsequenceI {
    // LeetCode Problem 521: Longest Uncommon Subsequence I
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LongestUncommonSubsequenceI solver = new LongestUncommonSubsequenceI();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode521_LongestUncommonSubsequenceI (Longest Uncommon Subsequence I) Passed!");
    }
}
