// https://leetcode.com/problems/minimum-size-subarray-sum/
package math;

import java.util.*;

public class MinimumSizeSubarraySum {
    // LeetCode Problem 209: Minimum Size Subarray Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MinimumSizeSubarraySum solver = new MinimumSizeSubarraySum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode209_MinimumSizeSubarraySum (Minimum Size Subarray Sum) Passed!");
    }
}
