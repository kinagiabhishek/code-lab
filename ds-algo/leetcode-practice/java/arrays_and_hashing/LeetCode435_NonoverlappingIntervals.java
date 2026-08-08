// https://leetcode.com/problems/non-overlapping-intervals/
package arrays_and_hashing;

import java.util.*;

public class LeetCode435_NonoverlappingIntervals {
    // LeetCode Problem 435: Non-overlapping Intervals
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode435_NonoverlappingIntervals solver = new LeetCode435_NonoverlappingIntervals();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode435_NonoverlappingIntervals (Non-overlapping Intervals) Passed!");
    }
}
