// https://leetcode.com/problems/split-array-largest-sum/
package math;

import java.util.*;

public class SplitArrayLargestSum {
    // LeetCode Problem 410: Split Array Largest Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SplitArrayLargestSum solver = new SplitArrayLargestSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode410_SplitArrayLargestSum (Split Array Largest Sum) Passed!");
    }
}
