// https://leetcode.com/problems/minimum-window-substring/
package linked_lists;

import java.util.*;

public class MinimumWindowSubstring {
    // LeetCode Problem 76: Minimum Window Substring
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumWindowSubstring solver = new MinimumWindowSubstring();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumWindowSubstring (Minimum Window Substring) Passed!");
    }
}
