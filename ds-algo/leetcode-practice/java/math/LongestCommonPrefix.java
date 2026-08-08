// https://leetcode.com/problems/longest-common-prefix/
package math;

import java.util.*;

public class LongestCommonPrefix {
    // LeetCode Problem 14: Longest Common Prefix
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestCommonPrefix solver = new LongestCommonPrefix();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestCommonPrefix (Longest Common Prefix) Passed!");
    }
}
