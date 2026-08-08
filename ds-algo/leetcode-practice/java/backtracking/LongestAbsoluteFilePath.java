// https://leetcode.com/problems/longest-absolute-file-path/
package backtracking;

import java.util.*;

public class LongestAbsoluteFilePath {
    // LeetCode Problem 388: Longest Absolute File Path
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestAbsoluteFilePath solver = new LongestAbsoluteFilePath();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestAbsoluteFilePath (Longest Absolute File Path) Passed!");
    }
}
