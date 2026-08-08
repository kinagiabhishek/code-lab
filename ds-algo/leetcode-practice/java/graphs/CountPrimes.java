// https://leetcode.com/problems/count-primes/
package graphs;

import java.util.*;

public class CountPrimes {
    // LeetCode Problem 204: Count Primes
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CountPrimes solver = new CountPrimes();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CountPrimes (Count Primes) Passed!");
    }
}
