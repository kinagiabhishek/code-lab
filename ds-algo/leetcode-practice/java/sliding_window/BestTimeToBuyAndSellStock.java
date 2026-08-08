// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
package sliding_window;

import java.util.*;

public class BestTimeToBuyAndSellStock {
public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, maxProfit = 0;
        for (int p : prices) {
            if (p < min) min = p;
            else if (p - min > maxProfit) maxProfit = p - min;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solver = new BestTimeToBuyAndSellStock();
        assert solver.maxProfit(new int[]{7,1,5,3,6,4}) == 5;
        System.out.println("✅ BestTimeToBuyAndSellStock Passed!");
    }
}
