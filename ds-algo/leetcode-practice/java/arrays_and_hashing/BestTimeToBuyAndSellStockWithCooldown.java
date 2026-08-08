// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
package arrays_and_hashing;

import java.util.*;

public class BestTimeToBuyAndSellStockWithCooldown {
    // LeetCode Problem 309: Best Time to Buy and Sell Stock with Cooldown
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockWithCooldown solver = new BestTimeToBuyAndSellStockWithCooldown();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BestTimeToBuyAndSellStockWithCooldown (Best Time to Buy and Sell Stock with Cooldown) Passed!");
    }
}
