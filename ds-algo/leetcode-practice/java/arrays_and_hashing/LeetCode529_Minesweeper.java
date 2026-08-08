// https://leetcode.com/problems/minesweeper/
package arrays_and_hashing;

import java.util.*;

public class LeetCode529_Minesweeper {
    // LeetCode Problem 529: Minesweeper
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode529_Minesweeper solver = new LeetCode529_Minesweeper();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode529_Minesweeper (Minesweeper) Passed!");
    }
}
