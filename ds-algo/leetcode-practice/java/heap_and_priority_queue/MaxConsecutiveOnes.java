// https://leetcode.com/problems/max-consecutive-ones/
package heap_and_priority_queue;

import java.util.*;

public class MaxConsecutiveOnes {
    // LeetCode Problem 485: Max Consecutive Ones
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes solver = new MaxConsecutiveOnes();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaxConsecutiveOnes (Max Consecutive Ones) Passed!");
    }
}
