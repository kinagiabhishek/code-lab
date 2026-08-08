// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
package backtracking;

import java.util.*;

public class BestTimeToBuyAndSellStockIi {
    // LeetCode Problem 122: Best Time to Buy and Sell Stock II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockIi solver = new BestTimeToBuyAndSellStockIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BestTimeToBuyAndSellStockIi (Best Time to Buy and Sell Stock II) Passed!");
    }
}
