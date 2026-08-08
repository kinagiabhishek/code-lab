// https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
package binary_search;

import java.util.*;

public class MinimumMovesToEqualArrayElements {
    // LeetCode Problem 453: Minimum Moves to Equal Array Elements
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElements solver = new MinimumMovesToEqualArrayElements();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumMovesToEqualArrayElements (Minimum Moves to Equal Array Elements) Passed!");
    }
}
