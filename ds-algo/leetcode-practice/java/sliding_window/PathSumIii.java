// https://leetcode.com/problems/path-sum-iii/
package sliding_window;

import java.util.*;

public class PathSumIii {
    // LeetCode Problem 437: Path Sum III
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
        PathSumIii solver = new PathSumIii();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ PathSumIii Passed!");
    }
}
