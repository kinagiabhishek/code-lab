// https://leetcode.com/problems/non-negative-integers-without-consecutive-ones/
package arrays_and_hashing;

import java.util.*;

public class NonnegativeIntegersWithoutConsecutiveOnes {
    // LeetCode Problem 600: Non-negative Integers without Consecutive Ones
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NonnegativeIntegersWithoutConsecutiveOnes solver = new NonnegativeIntegersWithoutConsecutiveOnes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode600_NonnegativeIntegersWithoutConsecutiveOnes (Non-negative Integers without Consecutive Ones) Passed!");
    }
}
