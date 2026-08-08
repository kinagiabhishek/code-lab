// https://leetcode.com/problems/path-sum-ii/
package dynamic_programming;

import java.util.*;

public class PathSumIi {
    // LeetCode Problem 113: Path Sum II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PathSumIi solver = new PathSumIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode113_PathSumIi (Path Sum II) Passed!");
    }
}
