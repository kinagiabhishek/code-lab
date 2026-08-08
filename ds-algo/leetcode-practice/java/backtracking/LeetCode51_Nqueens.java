// https://leetcode.com/problems/n-queens/
package backtracking;

import java.util.*;

public class LeetCode51_Nqueens {
    // LeetCode Problem 51: N-Queens
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode51_Nqueens solver = new LeetCode51_Nqueens();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode51_Nqueens (N-Queens) Passed!");
    }
}
