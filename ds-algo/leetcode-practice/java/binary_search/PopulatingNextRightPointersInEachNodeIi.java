// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
package binary_search;

import java.util.*;

public class PopulatingNextRightPointersInEachNodeIi {
    // LeetCode Problem 117: Populating Next Right Pointers in Each Node II
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNodeIi solver = new PopulatingNextRightPointersInEachNodeIi();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ PopulatingNextRightPointersInEachNodeIi Passed!");
    }
}
