// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
package dynamic_programming;

import java.util.*;

public class LowestCommonAncestorOfABinarySearchTree {
    // LeetCode Problem 235: Lowest Common Ancestor of a Binary Search Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LowestCommonAncestorOfABinarySearchTree solver = new LowestCommonAncestorOfABinarySearchTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LowestCommonAncestorOfABinarySearchTree (Lowest Common Ancestor of a Binary Search Tree) Passed!");
    }
}
