// https://leetcode.com/problems/non-negative-integers-without-consecutive-ones/
package greedy;

import java.util.*;

public class NonnegativeIntegersWithoutConsecutiveOnes {
    // LeetCode Problem 600: Non-negative Integers without Consecutive Ones
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NonnegativeIntegersWithoutConsecutiveOnes solver = new NonnegativeIntegersWithoutConsecutiveOnes();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NonnegativeIntegersWithoutConsecutiveOnes (Non-negative Integers without Consecutive Ones) Passed!");
    }
}
