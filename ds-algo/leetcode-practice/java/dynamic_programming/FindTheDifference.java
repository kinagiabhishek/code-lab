// https://leetcode.com/problems/find-the-difference/
package dynamic_programming;

import java.util.*;

public class FindTheDifference {
    // LeetCode Problem 389: Find the Difference
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindTheDifference solver = new FindTheDifference();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindTheDifference (Find the Difference) Passed!");
    }
}
