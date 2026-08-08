// https://leetcode.com/problems/maximum-subarray/
package greedy;

import java.util.*;

public class LeetCode53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]); maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}
