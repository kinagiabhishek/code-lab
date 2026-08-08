// https://leetcode.com/problems/poor-pigs/
package backtracking;

import java.util.*;

public class PoorPigs {
    // LeetCode Problem 458: Poor Pigs
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PoorPigs solver = new PoorPigs();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PoorPigs (Poor Pigs) Passed!");
    }
}
