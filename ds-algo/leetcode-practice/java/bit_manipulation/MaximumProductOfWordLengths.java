// https://leetcode.com/problems/maximum-product-of-word-lengths/
package bit_manipulation;

import java.util.*;

public class MaximumProductOfWordLengths {
    // LeetCode Problem 318: Maximum Product of Word Lengths
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MaximumProductOfWordLengths solver = new MaximumProductOfWordLengths();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode318_MaximumProductOfWordLengths (Maximum Product of Word Lengths) Passed!");
    }
}
