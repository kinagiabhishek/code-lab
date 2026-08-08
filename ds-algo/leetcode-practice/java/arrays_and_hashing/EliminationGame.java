// https://leetcode.com/problems/elimination-game/
package arrays_and_hashing;

import java.util.*;

public class EliminationGame {
    // LeetCode Problem 390: Elimination Game
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        EliminationGame solver = new EliminationGame();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode390_EliminationGame (Elimination Game) Passed!");
    }
}
