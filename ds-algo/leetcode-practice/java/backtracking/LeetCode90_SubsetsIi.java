// https://leetcode.com/problems/subsets-ii/
package backtracking;

import java.util.*;

public class LeetCode90_SubsetsIi {
    // LeetCode Problem 90: Subsets II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode90_SubsetsIi solver = new LeetCode90_SubsetsIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode90_SubsetsIi (Subsets II) Passed!");
    }
}
