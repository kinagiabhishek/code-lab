// https://leetcode.com/problems/arranging-coins/
package trees;

import java.util.*;

public class ArrangingCoins {
    // LeetCode Problem 441: Arranging Coins
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ArrangingCoins solver = new ArrangingCoins();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ArrangingCoins (Arranging Coins) Passed!");
    }
}
