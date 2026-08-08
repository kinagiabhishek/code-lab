// https://leetcode.com/problems/coin-change/
package dynamic_programming;
import java.util.Arrays;

public class LeetCode322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        LeetCode322_CoinChange solver = new LeetCode322_CoinChange();
        assert solver.coinChange(new int[]{1, 2, 5}, 11) == 3;
        assert solver.coinChange(new int[]{2}, 3) == -1;
        System.out.println("✅ LeetCode322_CoinChange Passed!");
    }
}
