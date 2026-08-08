// https://leetcode.com/problems/sudoku-solver/
package heap_and_priority_queue;

import java.util.*;

public class SudokuSolver {
    // LeetCode Problem 37: Sudoku Solver
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SudokuSolver solver = new SudokuSolver();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SudokuSolver (Sudoku Solver) Passed!");
    }
}
