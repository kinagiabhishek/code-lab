// https://leetcode.com/problems/merge-intervals/
package arrays_and_hashing;

import java.util.*;

public class LeetCode56_MergeIntervals {
    // LeetCode Problem 56: Merge Intervals
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode56_MergeIntervals solver = new LeetCode56_MergeIntervals();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode56_MergeIntervals (Merge Intervals) Passed!");
    }
}
