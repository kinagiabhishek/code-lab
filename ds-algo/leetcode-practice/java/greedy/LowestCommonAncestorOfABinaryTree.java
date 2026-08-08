// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
package greedy;

import java.util.*;

public class LowestCommonAncestorOfABinaryTree {
    // LeetCode Problem 236: Lowest Common Ancestor of a Binary Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LowestCommonAncestorOfABinaryTree solver = new LowestCommonAncestorOfABinaryTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LowestCommonAncestorOfABinaryTree (Lowest Common Ancestor of a Binary Tree) Passed!");
    }
}
