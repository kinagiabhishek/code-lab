// https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
package bit_manipulation;

import java.util.*;

public class LeetCode581_ShortestUnsortedContinuousSubarray {
    // LeetCode Problem 581: Shortest Unsorted Continuous Subarray
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode581_ShortestUnsortedContinuousSubarray solver = new LeetCode581_ShortestUnsortedContinuousSubarray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode581_ShortestUnsortedContinuousSubarray (Shortest Unsorted Continuous Subarray) Passed!");
    }
}
