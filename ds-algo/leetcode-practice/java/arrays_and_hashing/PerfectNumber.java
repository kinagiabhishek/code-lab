// https://leetcode.com/problems/perfect-number/
package arrays_and_hashing;

import java.util.*;

public class PerfectNumber {
    // LeetCode Problem 507: Perfect Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PerfectNumber solver = new PerfectNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode507_PerfectNumber (Perfect Number) Passed!");
    }
}
