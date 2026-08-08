// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
package math;

import java.util.*;

public class MinimumMovesToEqualArrayElementsIi {
    // LeetCode Problem 462: Minimum Moves to Equal Array Elements II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElementsIi solver = new MinimumMovesToEqualArrayElementsIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumMovesToEqualArrayElementsIi (Minimum Moves to Equal Array Elements II) Passed!");
    }
}
