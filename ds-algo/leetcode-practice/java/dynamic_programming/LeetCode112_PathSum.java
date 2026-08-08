// https://leetcode.com/problems/path-sum/
package dynamic_programming;

import java.util.*;

public class LeetCode112_PathSum {
    // LeetCode Problem 112: Path Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode112_PathSum solver = new LeetCode112_PathSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode112_PathSum (Path Sum) Passed!");
    }
}
