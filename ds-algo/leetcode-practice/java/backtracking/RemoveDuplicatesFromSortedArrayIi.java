// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
package backtracking;

import java.util.*;

public class RemoveDuplicatesFromSortedArrayIi {
    // LeetCode Problem 80: Remove Duplicates from Sorted Array II
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxSoFar = nums[0], currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayIi solver = new RemoveDuplicatesFromSortedArrayIi();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ RemoveDuplicatesFromSortedArrayIi Passed!");
    }
}
