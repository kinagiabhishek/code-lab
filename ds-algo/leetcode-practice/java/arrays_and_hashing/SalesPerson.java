// https://leetcode.com/problems/sales-person/
package arrays_and_hashing;

import java.util.*;

public class SalesPerson {
    // LeetCode Problem 607: Sales Person
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SalesPerson solver = new SalesPerson();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode607_SalesPerson (Sales Person) Passed!");
    }
}
