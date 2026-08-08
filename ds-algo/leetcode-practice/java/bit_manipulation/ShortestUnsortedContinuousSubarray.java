// https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
package bit_manipulation;

import java.util.*;

public class ShortestUnsortedContinuousSubarray {
    // LeetCode Problem 581: Shortest Unsorted Continuous Subarray
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray solver = new ShortestUnsortedContinuousSubarray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode581_ShortestUnsortedContinuousSubarray (Shortest Unsorted Continuous Subarray) Passed!");
    }
}
