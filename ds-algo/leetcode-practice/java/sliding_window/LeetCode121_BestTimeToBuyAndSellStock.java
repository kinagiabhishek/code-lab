// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
package sliding_window;
public class LeetCode121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, maxProfit = 0;
        for (int p : prices) {
            if (p < min) min = p;
            else if (p - min > maxProfit) maxProfit = p - min;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        assert new LeetCode121_BestTimeToBuyAndSellStock().maxProfit(new int[]{7,1,5,3,6,4}) == 5;
        System.out.println("✅ LeetCode121_BestTimeToBuyAndSellStock Passed!");
    }
}
