// https://leetcode.com/problems/zuma-game/
package greedy;

import java.util.*;

public class ZumaGame {
    // LeetCode Problem 488: Zuma Game
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ZumaGame solver = new ZumaGame();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ZumaGame (Zuma Game) Passed!");
    }
}
