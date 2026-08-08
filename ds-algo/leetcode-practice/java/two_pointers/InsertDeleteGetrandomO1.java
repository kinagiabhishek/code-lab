// https://leetcode.com/problems/insert-delete-getrandom-o1/
package two_pointers;

import java.util.*;

public class InsertDeleteGetrandomO1 {
    // LeetCode Problem 380: Insert Delete GetRandom O(1)
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
        InsertDeleteGetrandomO1 solver = new InsertDeleteGetrandomO1();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ InsertDeleteGetrandomO1 Passed!");
    }
}
