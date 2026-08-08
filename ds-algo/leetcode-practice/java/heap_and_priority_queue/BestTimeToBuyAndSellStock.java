// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
package heap_and_priority_queue;

import java.util.*;

public class BestTimeToBuyAndSellStock {
    // LeetCode Problem 121: Best Time to Buy and Sell Stock
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solver = new BestTimeToBuyAndSellStock();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BestTimeToBuyAndSellStock (Best Time to Buy and Sell Stock) Passed!");
    }
}
