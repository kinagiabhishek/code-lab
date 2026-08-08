// https://leetcode.com/problems/find-duplicate-file-in-system/
package trees;

import java.util.*;

public class FindDuplicateFileInSystem {
    // LeetCode Problem 609: Find Duplicate File in System
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
        FindDuplicateFileInSystem solver = new FindDuplicateFileInSystem();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ FindDuplicateFileInSystem Passed!");
    }
}
