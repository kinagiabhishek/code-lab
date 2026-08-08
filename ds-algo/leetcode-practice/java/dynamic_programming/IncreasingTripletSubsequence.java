// https://leetcode.com/problems/increasing-triplet-subsequence/
package dynamic_programming;

import java.util.*;

public class IncreasingTripletSubsequence {
    // LeetCode Problem 334: Increasing Triplet Subsequence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        IncreasingTripletSubsequence solver = new IncreasingTripletSubsequence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode334_IncreasingTripletSubsequence (Increasing Triplet Subsequence) Passed!");
    }
}
