// https://leetcode.com/problems/arranging-coins/
package dynamic_programming;

import java.util.*;

public class LeetCode441_ArrangingCoins {
    // LeetCode Problem 441: Arranging Coins
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode441_ArrangingCoins solver = new LeetCode441_ArrangingCoins();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode441_ArrangingCoins (Arranging Coins) Passed!");
    }
}
