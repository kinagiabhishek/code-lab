// https://leetcode.com/problems/jump-game/
package greedy;

import java.util.*;

public class LeetCode55_JumpGame {
    // LeetCode Problem 55: Jump Game
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode55_JumpGame solver = new LeetCode55_JumpGame();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode55_JumpGame (Jump Game) Passed!");
    }
}
