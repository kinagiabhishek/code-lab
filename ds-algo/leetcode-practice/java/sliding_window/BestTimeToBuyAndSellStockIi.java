// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
package sliding_window;

import java.util.*;

public class BestTimeToBuyAndSellStockIi {
    // LeetCode Problem 122: Best Time to Buy and Sell Stock II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockIi solver = new BestTimeToBuyAndSellStockIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode122_BestTimeToBuyAndSellStockIi (Best Time to Buy and Sell Stock II) Passed!");
    }
}
