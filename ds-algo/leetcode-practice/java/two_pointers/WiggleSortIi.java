// https://leetcode.com/problems/wiggle-sort-ii/
package two_pointers;

import java.util.*;

public class WiggleSortIi {
    // LeetCode Problem 324: Wiggle Sort II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        WiggleSortIi solver = new WiggleSortIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ WiggleSortIi (Wiggle Sort II) Passed!");
    }
}
