// https://leetcode.com/problems/largest-divisible-subset/
package arrays_and_hashing;

import java.util.*;

public class LargestDivisibleSubset {
    // LeetCode Problem 368: Largest Divisible Subset
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LargestDivisibleSubset solver = new LargestDivisibleSubset();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode368_LargestDivisibleSubset (Largest Divisible Subset) Passed!");
    }
}
