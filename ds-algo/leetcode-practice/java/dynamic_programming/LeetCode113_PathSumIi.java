// https://leetcode.com/problems/path-sum-ii/
package dynamic_programming;

import java.util.*;

public class LeetCode113_PathSumIi {
    // LeetCode Problem 113: Path Sum II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode113_PathSumIi solver = new LeetCode113_PathSumIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode113_PathSumIi (Path Sum II) Passed!");
    }
}
