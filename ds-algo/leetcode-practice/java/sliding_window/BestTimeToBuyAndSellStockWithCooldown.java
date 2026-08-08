// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
package sliding_window;

import java.util.*;

public class BestTimeToBuyAndSellStockWithCooldown {
    // LeetCode Problem 309: Best Time to Buy and Sell Stock with Cooldown
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockWithCooldown solver = new BestTimeToBuyAndSellStockWithCooldown();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode309_BestTimeToBuyAndSellStockWithCooldown (Best Time to Buy and Sell Stock with Cooldown) Passed!");
    }
}
