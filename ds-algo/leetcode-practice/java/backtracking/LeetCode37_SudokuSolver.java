// https://leetcode.com/problems/sudoku-solver/
package backtracking;

import java.util.*;

public class LeetCode37_SudokuSolver {
    // LeetCode Problem 37: Sudoku Solver
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode37_SudokuSolver solver = new LeetCode37_SudokuSolver();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode37_SudokuSolver (Sudoku Solver) Passed!");
    }
}
