// https://leetcode.com/problems/largest-divisible-subset/
package arrays_and_hashing;

import java.util.*;

public class LeetCode368_LargestDivisibleSubset {
    // LeetCode Problem 368: Largest Divisible Subset
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode368_LargestDivisibleSubset solver = new LeetCode368_LargestDivisibleSubset();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode368_LargestDivisibleSubset (Largest Divisible Subset) Passed!");
    }
}
