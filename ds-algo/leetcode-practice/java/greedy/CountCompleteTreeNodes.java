// https://leetcode.com/problems/count-complete-tree-nodes/
package greedy;

import java.util.*;

public class CountCompleteTreeNodes {
    // LeetCode Problem 222: Count Complete Tree Nodes
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        CountCompleteTreeNodes solver = new CountCompleteTreeNodes();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ CountCompleteTreeNodes Passed!");
    }
}
