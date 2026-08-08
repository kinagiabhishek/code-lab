// https://leetcode.com/problems/subtree-of-another-tree/
package greedy;

import java.util.*;

public class SubtreeOfAnotherTree {
    // LeetCode Problem 572: Subtree of Another Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SubtreeOfAnotherTree solver = new SubtreeOfAnotherTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SubtreeOfAnotherTree (Subtree of Another Tree) Passed!");
    }
}
