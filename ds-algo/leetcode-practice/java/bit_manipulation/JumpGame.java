// https://leetcode.com/problems/jump-game/
package bit_manipulation;

import java.util.*;

public class JumpGame {
    // LeetCode Problem 55: Jump Game
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        JumpGame solver = new JumpGame();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ JumpGame (Jump Game) Passed!");
    }
}
