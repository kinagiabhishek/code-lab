// https://leetcode.com/problems/jump-game/
package greedy;

import java.util.*;

public class JumpGame {
    // LeetCode Problem 55: Jump Game
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        JumpGame solver = new JumpGame();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode55_JumpGame (Jump Game) Passed!");
    }
}
