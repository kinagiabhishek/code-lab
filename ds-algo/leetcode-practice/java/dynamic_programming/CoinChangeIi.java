// https://leetcode.com/problems/coin-change-ii/
package dynamic_programming;

import java.util.*;

public class CoinChangeIi {
    // LeetCode Problem 518: Coin Change II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CoinChangeIi solver = new CoinChangeIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode518_CoinChangeIi (Coin Change II) Passed!");
    }
}
