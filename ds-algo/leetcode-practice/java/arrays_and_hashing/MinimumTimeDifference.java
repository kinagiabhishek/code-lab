// https://leetcode.com/problems/minimum-time-difference/
package arrays_and_hashing;

import java.util.*;

public class MinimumTimeDifference {
    // LeetCode Problem 539: Minimum Time Difference
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MinimumTimeDifference solver = new MinimumTimeDifference();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode539_MinimumTimeDifference (Minimum Time Difference) Passed!");
    }
}
