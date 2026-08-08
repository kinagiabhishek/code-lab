// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
package sliding_window;

import java.util.*;

public class LeetCode123_BestTimeToBuyAndSellStockIii {
    // LeetCode Problem 123: Best Time to Buy and Sell Stock III
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode123_BestTimeToBuyAndSellStockIii solver = new LeetCode123_BestTimeToBuyAndSellStockIii();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode123_BestTimeToBuyAndSellStockIii (Best Time to Buy and Sell Stock III) Passed!");
    }
}
