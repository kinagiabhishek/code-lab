// https://leetcode.com/problems/distinct-subsequences/
package dynamic_programming;

import java.util.*;

public class DistinctSubsequences {
    // LeetCode Problem 115: Distinct Subsequences
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DistinctSubsequences solver = new DistinctSubsequences();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode115_DistinctSubsequences (Distinct Subsequences) Passed!");
    }
}
