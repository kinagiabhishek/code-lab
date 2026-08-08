// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
package arrays_and_hashing;

import java.util.*;

public class BestTimeToBuyAndSellStockWithCooldown {
    // LeetCode Problem 309: Best Time to Buy and Sell Stock with Cooldown
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
        BestTimeToBuyAndSellStockWithCooldown solver = new BestTimeToBuyAndSellStockWithCooldown();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ BestTimeToBuyAndSellStockWithCooldown Passed!");
    }
}
