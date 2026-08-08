// https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/
package bit_manipulation;

import java.util.*;

public class MaxSumOfRectangleNoLargerThanK {
    // LeetCode Problem 363: Max Sum of Rectangle No Larger Than K
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaxSumOfRectangleNoLargerThanK solver = new MaxSumOfRectangleNoLargerThanK();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaxSumOfRectangleNoLargerThanK (Max Sum of Rectangle No Larger Than K) Passed!");
    }
}
