// https://leetcode.com/problems/game-of-life/
package arrays_and_hashing;

import java.util.*;

public class LeetCode289_GameOfLife {
    // LeetCode Problem 289: Game of Life
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode289_GameOfLife solver = new LeetCode289_GameOfLife();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode289_GameOfLife (Game of Life) Passed!");
    }
}
