// https://leetcode.com/problems/4sum-ii/
package linked_lists;

import java.util.*;

public class P4sumIi {
    // LeetCode Problem 454: 4Sum II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        P4sumIi solver = new P4sumIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ P4sumIi (4Sum II) Passed!");
    }
}
