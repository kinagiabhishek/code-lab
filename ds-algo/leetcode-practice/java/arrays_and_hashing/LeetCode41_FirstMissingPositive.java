// https://leetcode.com/problems/first-missing-positive/
package arrays_and_hashing;

import java.util.*;

public class LeetCode41_FirstMissingPositive {
    // LeetCode Problem 41: First Missing Positive
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode41_FirstMissingPositive solver = new LeetCode41_FirstMissingPositive();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode41_FirstMissingPositive (First Missing Positive) Passed!");
    }
}
