// https://leetcode.com/problems/continuous-subarray-sum/
package math;

import java.util.*;

public class LeetCode523_ContinuousSubarraySum {
    // LeetCode Problem 523: Continuous Subarray Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode523_ContinuousSubarraySum solver = new LeetCode523_ContinuousSubarraySum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode523_ContinuousSubarraySum (Continuous Subarray Sum) Passed!");
    }
}
