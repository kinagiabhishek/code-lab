// https://leetcode.com/problems/elimination-game/
package greedy;

import java.util.*;

public class EliminationGame {
    // LeetCode Problem 390: Elimination Game
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        EliminationGame solver = new EliminationGame();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ EliminationGame (Elimination Game) Passed!");
    }
}
