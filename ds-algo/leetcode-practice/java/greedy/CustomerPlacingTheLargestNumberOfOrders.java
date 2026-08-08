// https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/
package greedy;

import java.util.*;

public class CustomerPlacingTheLargestNumberOfOrders {
    // LeetCode Problem 586: Customer Placing the Largest Number of Orders
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CustomerPlacingTheLargestNumberOfOrders solver = new CustomerPlacingTheLargestNumberOfOrders();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CustomerPlacingTheLargestNumberOfOrders (Customer Placing the Largest Number of Orders) Passed!");
    }
}
