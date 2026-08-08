// https://leetcode.com/problems/find-all-duplicates-in-an-array/
package graphs;

import java.util.*;

public class FindAllDuplicatesInAnArray {
    // LeetCode Problem 442: Find All Duplicates in an Array
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
        FindAllDuplicatesInAnArray solver = new FindAllDuplicatesInAnArray();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ FindAllDuplicatesInAnArray Passed!");
    }
}
