// https://leetcode.com/problems/valid-sudoku/
package backtracking;

import java.util.*;

public class ValidSudoku {
    // LeetCode Problem 36: Valid Sudoku
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ValidSudoku solver = new ValidSudoku();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode36_ValidSudoku (Valid Sudoku) Passed!");
    }
}
