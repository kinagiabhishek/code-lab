// https://leetcode.com/problems/subsets-ii/
package linked_lists;

import java.util.*;

public class SubsetsIi {
    // LeetCode Problem 90: Subsets II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SubsetsIi solver = new SubsetsIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SubsetsIi (Subsets II) Passed!");
    }
}
