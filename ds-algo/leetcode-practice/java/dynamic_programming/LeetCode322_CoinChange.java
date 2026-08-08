// https://leetcode.com/problems/coin-change/
package dynamic_programming;
import java.util.Arrays;
public class LeetCode322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1, dp[] = new int[amount + 1]; Arrays.fill(dp, max); dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int c : coins) if (c <= i) dp[i] = Math.min(dp[i], dp[i - c] + 1);
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        assert new LeetCode322_CoinChange().coinChange(new int[]{1,2,5}, 11) == 3;
        System.out.println("✅ LeetCode322_CoinChange Passed!");
    }
}
