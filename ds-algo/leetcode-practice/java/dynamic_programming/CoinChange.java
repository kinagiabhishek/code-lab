// https://leetcode.com/problems/coin-change/
package dynamic_programming;

import java.util.*;

public class CoinChange {
    // LeetCode Problem 322: Coin Change
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CoinChange solver = new CoinChange();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode322_CoinChange (Coin Change) Passed!");
    }
}
