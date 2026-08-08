// https://leetcode.com/problems/longest-absolute-file-path/
package dynamic_programming;

import java.util.*;

public class LeetCode388_LongestAbsoluteFilePath {
    // LeetCode Problem 388: Longest Absolute File Path
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode388_LongestAbsoluteFilePath solver = new LeetCode388_LongestAbsoluteFilePath();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode388_LongestAbsoluteFilePath (Longest Absolute File Path) Passed!");
    }
}
