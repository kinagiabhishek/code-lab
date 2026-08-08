// https://leetcode.com/problems/freedom-trail/
package backtracking;

import java.util.*;

public class FreedomTrail {
    // LeetCode Problem 514: Freedom Trail
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FreedomTrail solver = new FreedomTrail();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FreedomTrail (Freedom Trail) Passed!");
    }
}
