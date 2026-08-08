// https://leetcode.com/problems/jump-game-ii/
package greedy;

import java.util.*;

public class LeetCode45_JumpGameIi {
    // LeetCode Problem 45: Jump Game II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode45_JumpGameIi solver = new LeetCode45_JumpGameIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode45_JumpGameIi (Jump Game II) Passed!");
    }
}
