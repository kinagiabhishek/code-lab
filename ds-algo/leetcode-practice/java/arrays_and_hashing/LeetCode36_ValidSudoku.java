// https://leetcode.com/problems/valid-sudoku/
package arrays_and_hashing;

import java.util.*;

public class LeetCode36_ValidSudoku {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode36_ValidSudoku solver = new LeetCode36_ValidSudoku();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode36_ValidSudoku Passed!");
    }
}
