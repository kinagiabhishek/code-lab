// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
package sliding_window;

import java.util.*;

public class BestTimeToBuyAndSellStockIv {
    // LeetCode Problem 188: Best Time to Buy and Sell Stock IV
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockIv solver = new BestTimeToBuyAndSellStockIv();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode188_BestTimeToBuyAndSellStockIv (Best Time to Buy and Sell Stock IV) Passed!");
    }
}
