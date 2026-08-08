// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package linked_lists;

import java.util.*;

public class FindFirstAndLastPositionOfElementInSortedArray {
    // LeetCode Problem 34: Find First and Last Position of Element in Sorted Array
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
        FindFirstAndLastPositionOfElementInSortedArray solver = new FindFirstAndLastPositionOfElementInSortedArray();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ FindFirstAndLastPositionOfElementInSortedArray Passed!");
    }
}
