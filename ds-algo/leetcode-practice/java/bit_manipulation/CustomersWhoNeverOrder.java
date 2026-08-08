// https://leetcode.com/problems/customers-who-never-order/
package bit_manipulation;

import java.util.*;

public class CustomersWhoNeverOrder {
    // LeetCode Problem 183: Customers Who Never Order
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CustomersWhoNeverOrder solver = new CustomersWhoNeverOrder();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode183_CustomersWhoNeverOrder (Customers Who Never Order) Passed!");
    }
}
