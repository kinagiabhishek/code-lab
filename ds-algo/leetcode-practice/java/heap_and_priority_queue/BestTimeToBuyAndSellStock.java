// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
package heap_and_priority_queue;

import java.util.*;

public class BestTimeToBuyAndSellStock {
    // LeetCode Problem 121: Best Time to Buy and Sell Stock
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxSoFar = nums[0], currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solver = new BestTimeToBuyAndSellStock();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ BestTimeToBuyAndSellStock Passed!");
    }
}
