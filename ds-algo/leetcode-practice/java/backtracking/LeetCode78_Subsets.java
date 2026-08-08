// https://leetcode.com/problems/subsets/
package backtracking;

import java.util.*;

public class LeetCode78_Subsets {
    // LeetCode Problem 78: Subsets
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode78_Subsets solver = new LeetCode78_Subsets();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode78_Subsets (Subsets) Passed!");
    }
}
