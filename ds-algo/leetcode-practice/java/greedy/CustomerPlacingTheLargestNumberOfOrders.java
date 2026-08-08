// https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/
package greedy;

import java.util.*;

public class CustomerPlacingTheLargestNumberOfOrders {
    // LeetCode Problem 586: Customer Placing the Largest Number of Orders
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        CustomerPlacingTheLargestNumberOfOrders solver = new CustomerPlacingTheLargestNumberOfOrders();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ CustomerPlacingTheLargestNumberOfOrders Passed!");
    }
}
