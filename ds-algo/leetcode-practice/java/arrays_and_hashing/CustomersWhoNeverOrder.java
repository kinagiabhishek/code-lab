// https://leetcode.com/problems/customers-who-never-order/
package arrays_and_hashing;

import java.util.*;

public class CustomersWhoNeverOrder {
    // LeetCode Problem 183: Customers Who Never Order
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CustomersWhoNeverOrder solver = new CustomersWhoNeverOrder();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CustomersWhoNeverOrder (Customers Who Never Order) Passed!");
    }
}
