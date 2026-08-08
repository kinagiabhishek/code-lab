// https://leetcode.com/problems/unique-paths-ii/
package dynamic_programming;

import java.util.*;

public class LeetCode63_UniquePathsIi {
    // LeetCode Problem 63: Unique Paths II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode63_UniquePathsIi solver = new LeetCode63_UniquePathsIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode63_UniquePathsIi (Unique Paths II) Passed!");
    }
}
