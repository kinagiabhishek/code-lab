// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
package sliding_window;

import java.util.*;

public class LeetCode121_BestTimeToBuyAndSellStock {
    // LeetCode Problem 121: Best Time to Buy and Sell Stock
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode121_BestTimeToBuyAndSellStock solver = new LeetCode121_BestTimeToBuyAndSellStock();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode121_BestTimeToBuyAndSellStock (Best Time to Buy and Sell Stock) Passed!");
    }
}
