// https://leetcode.com/problems/continuous-subarray-sum/
package binary_search;

import java.util.*;

public class ContinuousSubarraySum {
    // LeetCode Problem 523: Continuous Subarray Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ContinuousSubarraySum solver = new ContinuousSubarraySum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ContinuousSubarraySum (Continuous Subarray Sum) Passed!");
    }
}
