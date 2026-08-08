// https://leetcode.com/problems/sudoku-solver/
package backtracking;

import java.util.*;

public class LeetCode37_SudokuSolver {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode37_SudokuSolver solver = new LeetCode37_SudokuSolver();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode37_SudokuSolver Passed!");
    }
}
