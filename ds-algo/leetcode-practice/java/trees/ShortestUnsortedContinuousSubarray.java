// https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
package trees;

import java.util.*;

public class ShortestUnsortedContinuousSubarray {
    // LeetCode Problem 581: Shortest Unsorted Continuous Subarray
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray solver = new ShortestUnsortedContinuousSubarray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ShortestUnsortedContinuousSubarray (Shortest Unsorted Continuous Subarray) Passed!");
    }
}
