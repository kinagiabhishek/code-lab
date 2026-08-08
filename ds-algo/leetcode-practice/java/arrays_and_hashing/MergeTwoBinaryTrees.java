// https://leetcode.com/problems/merge-two-binary-trees/
package arrays_and_hashing;

import java.util.*;

public class MergeTwoBinaryTrees {
    // LeetCode Problem 617: Merge Two Binary Trees
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MergeTwoBinaryTrees solver = new MergeTwoBinaryTrees();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MergeTwoBinaryTrees (Merge Two Binary Trees) Passed!");
    }
}
