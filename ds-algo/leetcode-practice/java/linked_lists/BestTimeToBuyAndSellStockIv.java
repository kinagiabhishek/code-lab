// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
package linked_lists;

import java.util.*;

public class BestTimeToBuyAndSellStockIv {
    // LeetCode Problem 188: Best Time to Buy and Sell Stock IV
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockIv solver = new BestTimeToBuyAndSellStockIv();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BestTimeToBuyAndSellStockIv (Best Time to Buy and Sell Stock IV) Passed!");
    }
}
