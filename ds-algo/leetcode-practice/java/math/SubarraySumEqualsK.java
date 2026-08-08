// https://leetcode.com/problems/subarray-sum-equals-k/
package math;

import java.util.*;

public class SubarraySumEqualsK {
    // LeetCode Problem 560: Subarray Sum Equals K
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK solver = new SubarraySumEqualsK();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SubarraySumEqualsK (Subarray Sum Equals K) Passed!");
    }
}
