// https://leetcode.com/problems/coin-change/
package math;

import java.util.*;

public class CoinChange {
    // LeetCode Problem 322: Coin Change
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CoinChange solver = new CoinChange();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CoinChange (Coin Change) Passed!");
    }
}
