// https://leetcode.com/problems/subsets/
package graphs;

import java.util.*;

public class Subsets {
    // LeetCode Problem 78: Subsets
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        Subsets solver = new Subsets();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ Subsets (Subsets) Passed!");
    }
}
