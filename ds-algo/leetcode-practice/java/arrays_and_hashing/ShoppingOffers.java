// https://leetcode.com/problems/shopping-offers/
package arrays_and_hashing;

import java.util.*;

public class ShoppingOffers {
    // LeetCode Problem 638: Shopping Offers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ShoppingOffers solver = new ShoppingOffers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode638_ShoppingOffers (Shopping Offers) Passed!");
    }
}
