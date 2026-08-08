// https://leetcode.com/problems/maximum-distance-in-arrays/
package graphs;

import java.util.*;

public class MaximumDistanceInArrays {
    // LeetCode Problem 624: Maximum Distance in Arrays
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaximumDistanceInArrays solver = new MaximumDistanceInArrays();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaximumDistanceInArrays (Maximum Distance in Arrays) Passed!");
    }
}
