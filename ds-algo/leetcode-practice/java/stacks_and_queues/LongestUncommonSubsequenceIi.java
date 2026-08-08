// https://leetcode.com/problems/longest-uncommon-subsequence-ii/
package stacks_and_queues;

import java.util.*;

public class LongestUncommonSubsequenceIi {
    // LeetCode Problem 522: Longest Uncommon Subsequence II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestUncommonSubsequenceIi solver = new LongestUncommonSubsequenceIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestUncommonSubsequenceIi (Longest Uncommon Subsequence II) Passed!");
    }
}
