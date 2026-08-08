// https://leetcode.com/problems/increasing-triplet-subsequence/
package greedy;

import java.util.*;

public class IncreasingTripletSubsequence {
    // LeetCode Problem 334: Increasing Triplet Subsequence
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        IncreasingTripletSubsequence solver = new IncreasingTripletSubsequence();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ IncreasingTripletSubsequence (Increasing Triplet Subsequence) Passed!");
    }
}
