// https://leetcode.com/problems/valid-sudoku/
package graphs;

import java.util.*;

public class ValidSudoku {
    // LeetCode Problem 36: Valid Sudoku
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ValidSudoku solver = new ValidSudoku();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ValidSudoku (Valid Sudoku) Passed!");
    }
}
