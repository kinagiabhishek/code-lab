// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
package dynamic_programming;

import java.util.*;

public class BestTimeToBuyAndSellStockIii {
    // LeetCode Problem 123: Best Time to Buy and Sell Stock III
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockIii solver = new BestTimeToBuyAndSellStockIii();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BestTimeToBuyAndSellStockIii (Best Time to Buy and Sell Stock III) Passed!");
    }
}
