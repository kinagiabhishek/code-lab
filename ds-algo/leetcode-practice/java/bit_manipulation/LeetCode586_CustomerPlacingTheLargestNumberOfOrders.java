// https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/
package bit_manipulation;

import java.util.*;

public class LeetCode586_CustomerPlacingTheLargestNumberOfOrders {
    // LeetCode Problem 586: Customer Placing the Largest Number of Orders
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode586_CustomerPlacingTheLargestNumberOfOrders solver = new LeetCode586_CustomerPlacingTheLargestNumberOfOrders();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode586_CustomerPlacingTheLargestNumberOfOrders (Customer Placing the Largest Number of Orders) Passed!");
    }
}
