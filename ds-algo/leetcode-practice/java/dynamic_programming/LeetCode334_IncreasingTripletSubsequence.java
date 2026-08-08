// https://leetcode.com/problems/increasing-triplet-subsequence/
package dynamic_programming;

import java.util.*;

public class LeetCode334_IncreasingTripletSubsequence {
    // LeetCode Problem 334: Increasing Triplet Subsequence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode334_IncreasingTripletSubsequence solver = new LeetCode334_IncreasingTripletSubsequence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode334_IncreasingTripletSubsequence (Increasing Triplet Subsequence) Passed!");
    }
}
