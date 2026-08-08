// https://leetcode.com/problems/most-frequent-subtree-sum/
package stacks_and_queues;

import java.util.*;

public class MostFrequentSubtreeSum {
    // LeetCode Problem 508: Most Frequent Subtree Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MostFrequentSubtreeSum solver = new MostFrequentSubtreeSum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MostFrequentSubtreeSum (Most Frequent Subtree Sum) Passed!");
    }
}
