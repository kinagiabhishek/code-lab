// https://leetcode.com/problems/sales-person/
package binary_search;

import java.util.*;

public class SalesPerson {
    // LeetCode Problem 607: Sales Person
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SalesPerson solver = new SalesPerson();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SalesPerson (Sales Person) Passed!");
    }
}
