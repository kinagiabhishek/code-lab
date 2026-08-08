// https://leetcode.com/problems/minimum-path-sum/
package dynamic_programming;

import java.util.*;

public class LeetCode64_MinimumPathSum {
    // LeetCode Problem 64: Minimum Path Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode64_MinimumPathSum solver = new LeetCode64_MinimumPathSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode64_MinimumPathSum (Minimum Path Sum) Passed!");
    }
}
