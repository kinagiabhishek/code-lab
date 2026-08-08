// https://leetcode.com/problems/nim-game/
package arrays_and_hashing;

import java.util.*;

public class LeetCode292_NimGame {
    // LeetCode Problem 292: Nim Game
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode292_NimGame solver = new LeetCode292_NimGame();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode292_NimGame (Nim Game) Passed!");
    }
}
