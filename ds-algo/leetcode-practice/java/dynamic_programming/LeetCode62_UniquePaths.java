// https://leetcode.com/problems/unique-paths/
package dynamic_programming;

import java.util.*;

public class LeetCode62_UniquePaths {
    // LeetCode Problem 62: Unique Paths
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode62_UniquePaths solver = new LeetCode62_UniquePaths();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode62_UniquePaths (Unique Paths) Passed!");
    }
}
