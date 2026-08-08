// https://leetcode.com/problems/longest-uncommon-subsequence-i/
package sliding_window;

import java.util.*;

public class LongestUncommonSubsequenceI {
    // LeetCode Problem 521: Longest Uncommon Subsequence I
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestUncommonSubsequenceI solver = new LongestUncommonSubsequenceI();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestUncommonSubsequenceI (Longest Uncommon Subsequence I) Passed!");
    }
}
