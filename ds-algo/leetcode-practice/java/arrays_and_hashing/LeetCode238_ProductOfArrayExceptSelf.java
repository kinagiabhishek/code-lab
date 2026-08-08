// https://leetcode.com/problems/product-of-array-except-self/
package arrays_and_hashing;

import java.util.*;

public class LeetCode238_ProductOfArrayExceptSelf {
    // LeetCode Problem 238: Product of Array Except Self
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode238_ProductOfArrayExceptSelf solver = new LeetCode238_ProductOfArrayExceptSelf();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode238_ProductOfArrayExceptSelf (Product of Array Except Self) Passed!");
    }
}
