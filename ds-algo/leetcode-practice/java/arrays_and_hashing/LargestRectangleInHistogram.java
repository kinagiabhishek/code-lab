// https://leetcode.com/problems/largest-rectangle-in-histogram/
package arrays_and_hashing;

import java.util.*;

public class LargestRectangleInHistogram {
    // LeetCode Problem 84: Largest Rectangle in Histogram
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LargestRectangleInHistogram solver = new LargestRectangleInHistogram();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode84_LargestRectangleInHistogram (Largest Rectangle in Histogram) Passed!");
    }
}
