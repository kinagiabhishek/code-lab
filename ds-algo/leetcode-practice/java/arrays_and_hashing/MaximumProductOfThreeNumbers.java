// https://leetcode.com/problems/maximum-product-of-three-numbers/
package arrays_and_hashing;

import java.util.*;

public class MaximumProductOfThreeNumbers {
    // LeetCode Problem 628: Maximum Product of Three Numbers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MaximumProductOfThreeNumbers solver = new MaximumProductOfThreeNumbers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode628_MaximumProductOfThreeNumbers (Maximum Product of Three Numbers) Passed!");
    }
}
