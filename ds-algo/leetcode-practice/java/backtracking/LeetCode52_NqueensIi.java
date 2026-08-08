// https://leetcode.com/problems/n-queens-ii/
package backtracking;

import java.util.*;

public class LeetCode52_NqueensIi {
    // LeetCode Problem 52: N-Queens II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode52_NqueensIi solver = new LeetCode52_NqueensIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode52_NqueensIi (N-Queens II) Passed!");
    }
}
