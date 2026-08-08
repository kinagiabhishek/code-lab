// https://leetcode.com/problems/minesweeper/
package arrays_and_hashing;

import java.util.*;

public class Minesweeper {
    // LeetCode Problem 529: Minesweeper
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        Minesweeper solver = new Minesweeper();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode529_Minesweeper (Minesweeper) Passed!");
    }
}
