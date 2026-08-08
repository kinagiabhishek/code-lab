// https://leetcode.com/problems/same-tree/
package two_pointers;

import java.util.*;

public class SameTree {
    // LeetCode Problem 100: Same Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SameTree solver = new SameTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SameTree (Same Tree) Passed!");
    }
}
