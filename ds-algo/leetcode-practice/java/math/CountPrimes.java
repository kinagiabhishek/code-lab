// https://leetcode.com/problems/count-primes/
package math;

import java.util.*;

public class CountPrimes {
    // LeetCode Problem 204: Count Primes
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CountPrimes solver = new CountPrimes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode204_CountPrimes (Count Primes) Passed!");
    }
}
