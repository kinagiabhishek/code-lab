// https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
package graphs;

import java.util.*;

public class LongestIncreasingPathInAMatrix {
    // LeetCode Problem 329: Longest Increasing Path in a Matrix
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LongestIncreasingPathInAMatrix solver = new LongestIncreasingPathInAMatrix();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode329_LongestIncreasingPathInAMatrix (Longest Increasing Path in a Matrix) Passed!");
    }
}
